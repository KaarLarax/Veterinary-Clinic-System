/**
 * @author Sandro Martínez Pérez
 * @author Fernando David Gómez Gutierrez
 * @author Carlos Alberto Lara Hernández
 */
package DB;

import Conexion.Class_Conecction;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Revision_DB {
    private PreparedStatement PS;
    private final Class_Conecction CN;
    private DefaultTableModel DTM;
    private ResultSet RS;
    
    public Revision_DB() {
        this.PS = null;
        this.CN = new Class_Conecction();
    }
    
    private DefaultTableModel setTitulos() {
        DTM = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        DTM.addColumn("Id. Revisión");
        DTM.addColumn("Id. Animal");
        DTM.addColumn("Id. Veterinario");
        DTM.addColumn("F.  Revisión");
        DTM.addColumn("Observaciones");
        return DTM;
    }
    
    public DefaultTableModel getDatos() {
        String SQL_SELECT = """
                            SELECT * FROM revision""";
        try {
            this.setTitulos();
            PS = CN.getConnection().prepareStatement(SQL_SELECT);
            RS = PS.executeQuery();
            Object[] fila = new Object[6];
            while(RS.next()) {
                fila[0] = RS.getInt(1);
                fila[1] = RS.getInt(2);
                fila[2] = RS.getInt(3);
                fila[3] = RS.getDate(4);
                fila[4] = RS.getString(5);
                DTM.addRow(fila);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        } finally {
            PS = null;
            RS = null;
            CN.close();
        }
        return DTM;
    }
    
    public int insertarRegistro(int animal_id, int veterinarian_id, Date fRevision, String remarks) {
        int res = 0;
        final String SQL_INSERT = """
                                   INSERT INTO revision(animal_id, veterinarian_id, revision_date, remarks) values(?,?,?,?)""";
        try {
            PS = CN.getConnection().prepareStatement(SQL_INSERT);
            PS.setInt(1, animal_id);
            PS.setInt(2, veterinarian_id);
            PS.setDate(3, fRevision);
            PS.setString(4, remarks);
            res = PS.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Registro guardado", "Alta de una revision", 1);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar registro" + e.getMessage(),
                    "Alta de una revisión", 0);
        } finally {
            PS = null;
            CN.close();
        }
        
        return res;
    }
    
    public int actualizarRegistro(int animal_id, int veterinarian_id, Date fRevision, String remarks, int revision_id) {
        int res = 0;
        String SQL_UPDATE = "UPDATE revision SET animal_id='" 
                + animal_id + "', veterinarian_id='" + veterinarian_id 
                + "', revision_date='" + fRevision + "', remarks='" + remarks
                + "' WHERE revision_id ='" + revision_id + "'";
        try {
            PS = CN.getConnection().prepareStatement(SQL_UPDATE);
            res = PS.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Registro actualizado en BD", "Actualizar revision", 1);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar la BD" + e.getMessage(), "Actualizar revision", 1);
        } finally {
            PS = null;
            CN.close();
        }
        
        return res;
    }
    
    public int eliminarRegistro(int id) {
        int res = 0;
        String SQL_DELETE = "DELETE FROM revision WHERE revision_id = " + id;
        try {
            PS = CN.getConnection().prepareStatement(SQL_DELETE);
            res = PS.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Registro eliminado", "Eliminar un registro", 1);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar registro " + e.getMessage(),
                    "Eliminar registro", 0);
        } finally {
            PS = null;
            CN.close();
        }
        return res;
    }
}

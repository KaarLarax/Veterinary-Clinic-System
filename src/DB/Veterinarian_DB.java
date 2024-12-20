/**
 * @author Sandro Martínez Pérez
 * @author Fernando David Gómez Gutierrez
 * @author Carlos Alberto Lara Hernández
 */
package DB;

import Clases.Veterinarian;
import Conexion.Class_Conecction;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.sql.Date;
import java.sql.SQLException;
import java.time.ZoneId;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Veterinarian_DB {
    private PreparedStatement PS;
    private final Class_Conecction CN;
    private DefaultTableModel DTM;
    private ResultSet RS;
    
    public Veterinarian_DB() {
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
        DTM.addColumn("Id. Veterinario");
        DTM.addColumn("Nombre");
        DTM.addColumn("Especialización");
        DTM.addColumn("Teléfono");
        DTM.addColumn("F. Nacimiento");
        DTM.addColumn("F. Contratación");
        return DTM;
    }
    
    public DefaultTableModel getDatos() {
        String SQL_SELECT = """
                            SELECT * FROM veterinarian""";
        try {
            this.setTitulos();
            PS = CN.getConnection().prepareStatement(SQL_SELECT);
            RS = PS.executeQuery();
            Object[] fila = new Object[6];
            while(RS.next()) {
                fila[0] = RS.getInt(1);
                fila[1] = RS.getString(2);
                fila[2] = RS.getString(3);
                fila[3] = RS.getString(4);
                fila[4] = RS.getDate(5);
                fila[5] = RS.getDate(6);
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
    
    public int insertarRegistro(String name, String spec, String tel, Date fNacimiento, Date fContratacion) {
        final String SQL_INSERT = """
                                   INSERT INTO veterinarian(veterinarian_name, specialization, phone, veterinarian_dob, veterinarian_doh) values(?,?,?,?,?)""";
        int res = 0;
        try {
            PS = CN.getConnection().prepareStatement(SQL_INSERT);
            PS.setString(1, name);
            PS.setString(2, spec);
            PS.setString(3, tel);
            PS.setDate(4, fNacimiento);
            PS.setDate(5, fContratacion);
            res = PS.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Registro guardado", "Alta de un veterinario", 1);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar registro" + e.getMessage(),
                    "Alta de un veterinario", 0);
        } finally {
            PS = null;
            CN.close();
        }
        return res;
    }
    
    public int actualizarRegistro(String name, String spec, String tel, Date fNacimiento, Date fContratacion, int id) {
        int res = 0;
        String SQL_UPDATE = "UPDATE veterinarian SET veterinarian_name='" 
                + name + "', specialization='" + spec 
                + "', phone='" + tel + "', veterinarian_dob='" + fNacimiento
                + "', veterinarian_doh='" + fContratacion 
                + "' WHERE veterinarian_id ='" + id + "'";
        try {
            PS = CN.getConnection().prepareStatement(SQL_UPDATE);
            res = PS.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Registro actualizado en BD", "Actualizar veterinario", 1);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar la BD" + e.getMessage(), "Actualizar veterinario", 1);
        } finally {
            PS = null;
            CN.close();
        }
        return res;
    }
    
    public ArrayList<Veterinarian> generarLista() {
        ArrayList<Veterinarian> list = new ArrayList<>();
        String SQL_VETERINARIAN = "SELECT * FROM veterinarian";
        try {
            PS = CN.getConnection().prepareStatement(SQL_VETERINARIAN);
            RS = PS.executeQuery();
            while (RS.next()) {
                java.util.Date dob = new java.util.Date(RS.getDate("veterinarian_dob").getTime());
                java.util.Date doh = new java.util.Date(RS.getDate("veterinarian_doh").getTime());
                
                list.add(new Veterinarian(RS.getInt("veterinarian_id"),
                        RS.getString("veterinarian_name"),
                        RS.getString("specialization"),
                        RS.getString("phone"),
                        dob.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
                        doh.toInstant().atZone(ZoneId.systemDefault()).toLocalDate()));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al consultar registros" + e.getMessage(),
                    "Mostrar registros", 0);
        } finally {
            PS = null;
            RS = null;
            CN.close();
        }
        return list;
    }
    
    public Veterinarian buscarVeterinario(int id) {
        Veterinarian v = null;
        String SQL_VETERINARIAN = "SELECT * FROM veterinarian WHERE veterinarian_id =" + id;
        try {
            PS = CN.getConnection().prepareStatement(SQL_VETERINARIAN);
            RS = PS.executeQuery();
            RS.next();
            java.util.Date dob = new java.util.Date(RS.getDate("veterinarian_dob").getTime());
            java.util.Date doh = new java.util.Date(RS.getDate("veterinarian_doh").getTime());
            v = new Veterinarian(RS.getInt(1), RS.getString(2), RS.getString(3), RS.getString(4),
                    dob.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
                    doh.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de animal " + e.getMessage());
        } finally {
            PS = null;
            RS = null;
            CN.close();
        }
        return v;
    }
    
    public int eliminarRegistro(int id) {
        int res = 0;
        String SQL_DELETE = "DELETE FROM veterinarian WHERE veterinarian_id = " + id;
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

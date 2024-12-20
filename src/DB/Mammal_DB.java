/**
 * @author Sandro Martínez Pérez
 * @author Fernando David Gómez Gutierrez
 * @author Carlos Alberto Lara Hernández
 */
package DB;

import Conexion.Class_Conecction;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Mammal_DB {
    private PreparedStatement PS;
    private final Class_Conecction CN;
    private DefaultTableModel DTM;
    private ResultSet RS;
    
    public Mammal_DB() {
        this.CN = new Class_Conecction();
        this.PS = null;
    }
    
    private DefaultTableModel setTitulos() {
        DTM = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        DTM.addColumn("Id. Animal");
        DTM.addColumn("Nombre");
        DTM.addColumn("Color");
        DTM.addColumn("Sexo");
        DTM.addColumn("F. Nacimiento");
        DTM.addColumn("T. Pelo");
        DTM.addColumn("N. Dientes");
        DTM.addColumn("Categoria");
        return DTM;
    }
    
    public DefaultTableModel getDatos() {
        String SQL_SELECT = """
                            SELECT A.*, M.* 
                            FROM animal AS A
                            LEFT JOIN mammal AS M ON A.animal_id = M.animalm_id
                            WHERE A.animal_type = ?""";
        try {
            this.setTitulos();
            PS = CN.getConnection().prepareStatement(SQL_SELECT);
            PS.setString(1, "mammal");
            
            RS = PS.executeQuery();
            Object[] fila = new Object[8];
            while(RS.next()) {
                fila[0] = RS.getInt(1);
                fila[1] = RS.getString(3);
                fila[2] = RS.getString(4);
                fila[3] = RS.getString(5);
                fila[4] = RS.getDate(6);
                fila[5] = RS.getString(9);
                fila[6] = RS.getInt(10);
                fila[7] = RS.getString(11);
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
    
    public int insertarRegistro(String animalType, String animalName, String animalColor, String sex, Date animalDOB, String hair_type, int number_of_teeth, 
            String category) {
        int res = 0;
        final String SQL_INSERT1 = """
                                   INSERT INTO animal(animal_type, animal_name, color, sex, animal_dob) values(?,?,?,?,?)""";
        final String SQL_INSERT2 = """
                                   INSERT INTO mammal(animalm_id, hair_type, number_of_teeth, category) values(?,?,?,?)""";
        try {
            PS = CN.getConnection().prepareStatement(SQL_INSERT1, PS.RETURN_GENERATED_KEYS);
            PS.setString(1, animalType);
            PS.setString(2, animalName);
            PS.setString(3, animalColor);
            PS.setString(4, sex);
            PS.setDate(5, animalDOB);
            res = PS.executeUpdate();
            
            if (res > 0) {
                try (ResultSet generatedKeys = PS.getGeneratedKeys()) {
                        if (generatedKeys.next()) {
                            int lastIdInAnimal = generatedKeys.getInt(1);
                            PS = CN.getConnection().prepareStatement(SQL_INSERT2);
                            PS.setInt(1, lastIdInAnimal);
                            PS.setString(2, hair_type);
                            PS.setInt(3, number_of_teeth);
                            PS.setString(4, category);
                            res = PS.executeUpdate();
                        }
                }        
            }
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Registro guardado", "Alta de un mamífero", 1);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar registro " + e.getMessage(),
                    "Alta de un mamífero", 0);
        } finally {
            PS = null;
            CN.close();
        }
        return res;
    }
    
    public int actualizarRegistro(String animalName, String animalColor, String sex, Date animalDOB, String hair_type, int number_of_teeth, 
            String category, int id) {
        int res = 0;
        String SQL_UPDATE = "UPDATE animal SET animal_name='" 
                + animalName + "', color='" + animalColor 
                + "', sex='" + sex + "', animal_dob='" + animalDOB 
                + "' WHERE animal_id ='" + id + "'";
        try {
            PS = CN.getConnection().prepareStatement(SQL_UPDATE);
            PS.executeUpdate();
            
            SQL_UPDATE = "UPDATE mammal SET hair_type='" 
                + hair_type + "', number_of_teeth='" + number_of_teeth 
                + "', category='" + category 
                    + "' WHERE animalm_id ='" + id + "'";
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
    
    public int eliminarRegistro(int id) throws SQLException {
        int res = 0;
        String SQL_DELETE = "DELETE FROM mammal WHERE animalm_id = " + id;
        try {
            PS = CN.getConnection().prepareStatement(SQL_DELETE);
            PS.executeUpdate();
            SQL_DELETE = "DELETE FROM animal WHERE animal_id = " + id;
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

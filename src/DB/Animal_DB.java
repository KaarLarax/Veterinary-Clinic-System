/**
 * @author Sandro Martínez Pérez
 * @author Fernando David Gómez Gutierrez
 * @author Carlos Alberto Lara Hernández
 */
package DB;

import Clases.Animal;
import Conexion.Class_Conecction;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.ZoneId;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Animal_DB {
    private PreparedStatement PS;
    private final Class_Conecction CN;
    private ResultSet RS;
    
    public Animal_DB() {
        this.PS = null;
        this.CN = new Class_Conecction();
    }
    
    public ArrayList<Animal> generarLista() {
        ArrayList<Animal> list = new ArrayList<>();
        String SQL_ANIMAL = "SELECT * FROM animal";
        try {
            PS = CN.getConnection().prepareStatement(SQL_ANIMAL);
            RS = PS.executeQuery();
            while (RS.next()) {
                java.util.Date dob = new java.util.Date(RS.getDate("animal_dob").getTime());
                
                list.add(new Animal(RS.getInt("animal_id"),
                        RS.getString("animal_name"),
                        RS.getString("color"),
                        RS.getString("sex"),
                        dob.toInstant().atZone(ZoneId.systemDefault()).toLocalDate()));
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
    
    public Animal buscarAnimal(int id) {
        Animal v = null;
        String SQL_ANIMAL = "SELECT * FROM animal WHERE animal_id =" + id;
        try {
            PS = CN.getConnection().prepareStatement(SQL_ANIMAL);
            RS = PS.executeQuery();
            RS.next();
            java.util.Date dob = new java.util.Date(RS.getDate("animal_dob").getTime());
            
            v = new Animal(RS.getInt("animal_id"),
                    RS.getString("animal_name"),
                        RS.getString("color"),
                        RS.getString("sex"),
                        dob.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de animal " + e.getMessage());
        } finally {
            PS = null;
            RS = null;
            CN.close();
        }
        return v;
    }
}

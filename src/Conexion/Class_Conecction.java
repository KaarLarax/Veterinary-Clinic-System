/**
 * @author Sandro Martínez Pérez
 * @author Fernando David Gómez Gutierrez
 * @author Carlos Alberto Lara Hernández
 */
package Conexion;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Class_Conecction {

    private static Connection cnx;
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String BD = "niupi";
    private static final String USER = "root";
    private static final String PASSWORD = "ROOT";
    private static final String URL = "jdbc:mysql://localhost:3306/" + BD + "?useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC";

    public Class_Conecction() {
        cnx = null;
    }

    public Connection getConnection() {
        cnx = null;
        try {
            Class.forName(DRIVER);
            cnx = (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se pudo realizar la convercion de clases" + e.getMessage(), "Error al conectar", 0);
            System.exit(0);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexion" + e.getMessage(), "Error al conectar", 0);
        }
        return cnx;
    }

    public void close() {
        try {
            cnx.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cerrar la conexion " + e.getMessage(), "Error al cerrar la BD", 0);
        }
    }
}


package confi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author FERNANDO
 */
public class Conexion {
    Connection con;
    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/registro_","root","");
        } catch (ClassNotFoundException | SQLException e) {
            
        }
    }
    public Connection getConnection () {
        return con;
    }
    
}

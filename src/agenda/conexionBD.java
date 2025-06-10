
package agenda;



/**
 *
 * @author Master
 */
import java.sql.DriverManager;

import java.sql.Connection;
import javax.swing.JOptionPane;

public class conexionBD {
    
    Connection conectar=null;
    
    public Connection conexionBD()
    {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        conectar = (Connection)DriverManager.getConnection("jdbc:Mysql://127.0.0.1:3306/agenda","root","BaseDeDatos555");
        JOptionPane.showMessageDialog(null, "Conexion exitosa");
        
        
        }catch(Exception e)
        {
        System.err.println("Error al conectarse" + e);
        }
        return conectar;
    }
    
}

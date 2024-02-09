 
package promec.software;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Conexion {
 private static Connection conn;    
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String user = "root";
    private static final String clave = "";
    private static final String url = "jdbc:mysql://localhost:3306/";    
    public Conexion(String bd) {
        conn = null;   
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url+bd, user, clave);
            if(conn != null){
                System.out.println("Conexion Establecida a base de datos: " + bd );
            }
        }
        catch(Exception e) {
            System.out.println("No se pudo conectar " + e);
            e.printStackTrace();
        }
    }
    
    public Connection getConnection(){
        return conn;
    }
    
    public void desconectar(){
        conn = null;
        if( conn == null){
            System.out.println("Conexion Terminada...");
        }               
    }


    
}

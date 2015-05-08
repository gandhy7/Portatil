package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *clase encarga de hacer la conexion de las diferentes sentencias a la base de datos
 * @author GANDHY 2014
 */
public class conexion {  
    
   

    /*public String bd = "cheques";
     * public String login = "grivera";
     * public String password = "work0225";
     * //este campo tiempo hora hacce que cuando el campo DateTime sea 0000/00/00 00:00 Ireport lo pueda cargar
     * public String tiempohora = "zeroDateTimeBehavior = convertToNull";
     * public String url = "jdbc:mysql://190.66.7.136:3306/"+bd+tiempohora;*/
    
    
    public String bd = "cheques";
    public String login = "root";
    public String password = "";
     //este campo tiempo hora hacce que cuando el campo DateTime sea 0000/00/00 00:00 Ireport lo pueda cargar
    public String url = "jdbc:mysql://localhost/"+bd; 
    
       

//    public String bd = "cheques";
//    public String login = "admin";
//    public String password = "";
//    public String url = "jdbc:mysql://192.168.0.1/"+bd; 



public Connection conectar() {
Connection conn = null;
try {
Class.forName("org.gjt.mm.mysql.Driver");
conn = DriverManager.getConnection(url, login, password);
if (conn != null)
{
System.out.println("Conexión a base de datos "+url+" ... Ok");
//conn.close();
}
}
catch(SQLException ex) {
System.out.println("Hubo un problema al intentar conectarse con la base de datos "+url);
}
catch(ClassNotFoundException ex) {
System.out.println(ex);
System.out.println("posiblemente no tiene la libreria para conexion mysql "+url);
}
            return conn;
            
            
        
         
           
}

     
    }

    
    
    
    
    
    
    


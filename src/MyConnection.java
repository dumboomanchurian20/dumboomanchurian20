


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author 1BestCsharp
 */
public class MyConnection {
    
    
    // create a function to connect with mysql database
    static Connection con;
    public static Connection getConnection() throws SQLException{
        try {
           
            
            Class.forName("com.mysql.jdbc.Driver");
            con  = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/registeruser", "root", "");
            System.out.println("Connection successful");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
        
    
    
    }   
}



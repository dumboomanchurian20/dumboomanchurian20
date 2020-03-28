package conn;
import java.sql.Connection;
import java.sql.DriverManager;
public class Myconn {
    static Connection con;
    
    public static Connection getCon()throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection
        ("jdbc:mysql://http://localhost/phpmyadmin/index.php?db=quize&token=249df9cca51dcf0d2bfefbb14ff78273", "root",
                "");
        return con;
    }
}

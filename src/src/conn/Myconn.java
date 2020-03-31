package conn;
import java.sql.Connection;
import java.sql.DriverManager;
public class Myconn {
    static Connection con;
    
    public static Connection getCon()throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection
        ("jdbc:mysql://localhost:3306/test", "root",
                "");
        return con;
    }
}

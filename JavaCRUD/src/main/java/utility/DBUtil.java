package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	private static final String url = "jdbc:mysql://localhost:3306/example"; // jdbc:mysql://localhost:3306/<YOUR_DB_NAME>
	private static final String username = "root";	// DB user name, default it is "root" 
   	private static final String password = "";	// User password, default it is ""
   	private static Connection conn;
    
    	public static Connection getConnection() {
    		try {
    			Class.forName("com.mysql.jdbc.Driver");
            		conn = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
    	
    		return conn;
    	}
	
}

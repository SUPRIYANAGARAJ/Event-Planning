package event;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MyConnection {
	
static Connection con;
	
	public static Connection getMyConnection() throws FileNotFoundException, IOException, SQLException
	{
		if(con==null) {
		Properties property = new Properties();
		property.load(new FileInputStream(new File("C:\\Users\\Santosh\\eclipse-workspace\\corejavaBatch2\\src\\event\\db.properties")));
		String url = property.getProperty("url");
		String username = property.getProperty("username");
		String password = property.getProperty("password");
		
		con = DriverManager.getConnection(url,username,password);
		
		return con;
		}
		else {
			return con;
		}
		
	}

}

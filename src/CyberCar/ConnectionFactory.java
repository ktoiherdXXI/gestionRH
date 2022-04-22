package CyberCar;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @class permettant la connexion avec la base de donnée  
 * 
 *
 */
public class ConnectionFactory {
	
		private static String driverClassName;
		private static String connectionUrl;
		private static String dbUser;
		private static String dbPassword;
		
		private final static Properties dbProperties = new Properties();
		static{
			try(InputStream input = new FileInputStream("src/cybercar/dbconfig.properties")){
				dbProperties.load(input); 
				driverClassName = dbProperties.getProperty("driver-class-name");
				connectionUrl = dbProperties.getProperty("connection-url");
				dbUser = dbProperties.getProperty("user");
				dbPassword = dbProperties.getProperty("password");
//				System.out.println("Connexion réussi");
				
				
				
			}catch(IOException ioex){
				ioex.printStackTrace();
			}
		}

		public static Connection getConnection() throws SQLException {
			Connection conn = null;
			conn = DriverManager.getConnection(connectionUrl, dbUser, dbPassword);
			return conn;
		}
	


}

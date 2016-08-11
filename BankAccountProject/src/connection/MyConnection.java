package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




public class MyConnection 
{
	public static Connection con;
	public MyConnection() throws ClassNotFoundException
	{
		Class.forName("com.mysql.jdbc.Driver");
		
	}
	public Connection getConnection() throws SQLException
	{
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","root");
		return con;
	}
	
}

package KT.KTproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class Mysql 
{
	@Test
	
	public void database() throws ClassNotFoundException, SQLException
	{
		//connecting jdbc driver with database
		//loads the driver
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");
		
		//if data base in located in another system then need to provide IP address of that machine.
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium","username","pasword");
		System.out.println("connected to db");
		Statement createStatement = connection.createStatement();
		ResultSet executeQuery = createStatement.executeQuery("Select from orders where orderNum=3910431941");
		
		while(executeQuery.next())
		{
			String string = executeQuery.getString("firstname");
			System.out.println(string);
		}
	}

}

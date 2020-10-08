package controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static Connection createConnection() {
	Connection con=null;
	/*
	 * String url="jdbc:mysql://localhost:3306/d1"; String mysqluname="root"; String
	 * mysqlpwd="mysql";
	 */
	String url="jdbc:postgresql://10.184.43.78:5432/d1";
	String mysqluname="postgres";
	String mysqlpwd="postgres";

	try 
	 {
	 try 
	 {
		 Class.forName("org.postgresql.Driver");
	 //Class.forName("com.mysql.jdbc.Driver"); //loading MySQL drivers. This differs for database servers 
	 } 
	 catch (ClassNotFoundException e)
	 {
	 e.printStackTrace();
	 }
	 
	 con = DriverManager.getConnection(url, mysqluname,mysqlpwd); //attempting to connect to MySQL database
	 System.out.println("Printing connection object "+con);
	 } 
	 catch (Exception e) 
	 {
	 e.printStackTrace();
	 }
	 
	 return con; 
}
}

package dao;
import bean.login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import controller.DBConnection;



public class logindao {
	public String register(login l) {
		
		String un=l.getUname();
		String pw=l.getPwd();
		Connection con=null;
	PreparedStatement p=null;
	try {
		
		con=DBConnection.createConnection();
		
		String query="insert into d1.user values(?,?)";
		p=con.prepareStatement(query);
		p.setString(1, un);
		p.setString(2, pw);
		int i=p.executeUpdate();
		
		if (i!=0)
			return "success";
	    }
		 catch(SQLException e)
		 {
		 e.printStackTrace();
			return "Something wrong";
		 }
	return "Home Page";
	 

	}

	public String login(login l) {
	String un=l.getUname();
	String pw=l.getPwd();
	Connection con=null;
	PreparedStatement p=null;
	try {

	con=DBConnection.createConnection();

	String query="select * from user";
	p=con.prepareStatement(query);
	ResultSet rs=p.executeQuery();

	while (rs.next()) {
		if ((rs.getString(1).equals(un))&&(rs.getString(2).equals(pw)))
			{
			return "Welcome" ;
			}
	}
	}
	 catch(SQLException e)
	 {
	 e.printStackTrace();
		return "Wrong user";

	 }
	 
	return "Home Page";

	}
}

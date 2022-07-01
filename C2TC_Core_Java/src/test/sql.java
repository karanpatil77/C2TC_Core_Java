package test;
import java.sql.*;
import com.mysql.jdbc.Connection;
public class sql {
	public static void main(String[] args) {
		try 
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/karandb1","root","root007");
		Statement stmt=con.createStatement();
		System.out.println("Connection Established");
		String str="Select * from employee order by name";
		ResultSet rs=stmt.executeQuery(str);
		{
			while(rs.next())
			{
				System.out.print("id:"+rs.getInt("id"));
				System.out.print("name:"+rs.getInt("name"));
				System.out.print("job:"+rs.getInt("job"));
			}
		}
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}

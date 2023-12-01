package databasePack;

import java.sql.*;

public class Practic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		}
		catch (ClassNotFoundException e) {
			// TODO: handle exception
			
			System.out.println("Problem in loading the driver");
			e.printStackTrace();
		}
		
		try {
			String dbName = "Employee.accdb";
			String dbURL  = "jdbc:ucanaccess://"+dbName;
			conn = DriverManager.getConnection(dbURL);
			
			stat = conn.createStatement();
			String query = "INSERT INTO EMP (EName,Salary)"+ "values ('ABC',65000)";
			stat.executeQuery(query);
			
			query = "UPDATE EMP SET Salary = 120000" + "Where Ename = 'ABC'";
			stat.executeUpdate(query);
			
			query = ""
			
			rs   = stat.executeQuery("SELEST * FROM Emp");
			int id;
			String name;
			double sal;
			
			while (rs.next()) {
				id= rs.getInt(1);
				name = rs.getString(2);
				sal = rs.getDouble(3);
				System.out.println("id "+id+"name "+name+"salary "+sal)
				;
				
			}
		} catch (SQLException e) {
			// TODO: handle exception\
			e.printStackTrace();
		}
		finally {
			
		}
	}

}

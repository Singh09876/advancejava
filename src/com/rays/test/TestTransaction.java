package com.rays.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestTransaction {
	
	public static void main(String[] args)  throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sunrays", "root", "root");

		try {

			conn.setAutoCommit(false);

			Statement stmt = conn.createStatement();

			int i = stmt.executeUpdate("insert into emp values(8, 'mahi', 41000)");

			i = stmt.executeUpdate("insert into emp values(9, 'deepesh', 1000)");

			i = stmt.executeUpdate("insert into emp values(9, 'yash', 1000)");

			conn.commit();
			conn.close();
			System.out.println("Data inserted " + i);

		} catch (Exception e) {

			conn.rollback();

		}

		
		
	}
	
	

}

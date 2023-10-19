package com.rays.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestCRUD {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/aryan", "root", "root");
	
		PreparedStatement ps = conn.prepareStatement("insert into user values(10, 'hardeep', 6000)");
	
		int i = ps.executeUpdate();
		System.out.println("Data Inserted " + i);

	}	
}

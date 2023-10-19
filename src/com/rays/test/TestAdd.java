package com.rays.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestAdd {
 
 public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/aryan", "root", "root");

	
     Statement stmt= conn.createStatement();
   int i= stmt.executeUpdate("insert into user values (8,'shivu',1000) ");
 System.out.println("data inserted " + i);
 
 }
	
	
}

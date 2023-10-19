package com.rays.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestAdd1 {
public static void main(String[] args) throws Exception {

//	testSelect();
	add(9, "shubham", 3000);
	
	
	
	
	
	
	
}
private static void testSelect() throws Exception {

	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/aryan", "root", "root");
   Statement stmt=	conn.createStatement();	
      ResultSet rs= stmt.executeQuery("select * from user");
      while (rs.next()) {
    	  System.out.print(rs.getInt(1));
    	  System.out.print("\t"+rs.getString(2));
    	  System.out.println("\t"+rs.getInt(3));
	}   
}

private static void add(int id, String name, int salary) throws Exception{
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	 Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/aryan","root", "root");
       Statement stmt=	conn.createStatement();
       int i = stmt.executeUpdate("insert into user values(" + id + ", '" + name + "', " + salary +" )");
	System.out.println("data inserted "+i);
}

}

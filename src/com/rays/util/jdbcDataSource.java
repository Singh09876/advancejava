package com.rays.util;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public final class jdbcDataSource {

	
  private	static jdbcDataSource  jds = null;
	private  ComboPooledDataSource ds = null;
	
	private jdbcDataSource() {
		
		
		
		try 
		{ 
			ds = new ComboPooledDataSource();
			
			ds.setDriverClass("com.mysql.jdbc.Driver");
			ds.setJdbcUrl("jdbc:mysql://localhost/sunrays");
			ds.setUser("root");
			ds.setPassword("123");
			ds.setInitialPoolSize(5);
			ds.setAcquireIncrement(5);
			ds.setMaxPoolSize(50);
			
		}catch (PropertyVetoException e) {
e.printStackTrace();
		}
	}
	
	public static jdbcDataSource getInstance() {
		if (jds==null) {
			jds = new jdbcDataSource();
		}
		return jds;
		
	}
	public static Connection getConnection() {
		try {
			return getInstance().ds.getConnection();	
		}catch (SQLException e) {
        return null;
		}
	}
	
	public static void  closeConnection (Connection conn, Statement stmt,
			ResultSet rs) {
		try {
			if (rs != null)rs.close();
			if (stmt !=null)stmt.close();
			if (conn !=null) conn.close();
		}catch (SQLException e) {
e.printStackTrace();
		
		}
	}
	
	public static void  closeConnection ( 
		Connection conn, Statement stmt) {
		closeConnection(conn, stmt ,null);
	}
	
	public static void  closeConnection ( 
			Connection conn) {
		closeConnection(conn,null,null);
	}
		
}

package com.jctm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionProvider {
	private static String driver = null;
	private static String url = null;
	private static String username = null;
	private static String password = null;
	
	public static Connection getConnection() { return getConnection("/common.properties"); }
		
	public static Connection getConnection(String propertiesPath){
		if(driver==null){
			Properties p = PropertiesUtil.loadProperties(propertiesPath);
			if(p != null){
				driver = p.getProperty("jdbc.driver").trim();
				url = p.getProperty("jdbc.url").trim();
				username = p.getProperty("jdbc.username").trim();
				password = p.getProperty("jdbc.password").trim();
			}
		}
		java.sql.Connection con=null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, username, password);
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException se) {
			se.printStackTrace();
		}
		return con;
	}
}

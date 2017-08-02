package com.revature.connection;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
	private static ConnectionFactory cf = null;

	private static boolean build = true;

	private ConnectionFactory() {

	}

	public static synchronized ConnectionFactory getInstance(){
		if(build){
			cf = new ConnectionFactory();
			build = false;
		}
		return cf;
		
	}
	
	public Connection getConnection() {
		Connection conn = null;
		try {

			Properties prop = new Properties();/*
			
			try {
				prop.load(new FileReader("datasource.properties"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			conn = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("username"),
					prop.getProperty("password"));
			*/try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			conn = DriverManager.getConnection("jdbc:oracle:thin:@trmsapp.ceupujns7wbp.us-east-1.rds.amazonaws.com:1521:ORCL", "TRMSApp",
					"TRMSApp123");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
}


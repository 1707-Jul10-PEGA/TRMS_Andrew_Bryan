package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.beans.LoginCred;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ObjectMapper om = new ObjectMapper();
		System.out.println(request.getParameter("login_cred"));
		LoginCred logInfo = om.readValue(request.getParameter("login_cred"), LoginCred.class);
		System.out.println(logInfo);
		Connection conn;
		try {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			conn = DriverManager.getConnection("jdbc:oracle:thin:@trmsapp.ceupujns7wbp.us-east-1.rds.amazonaws.com:1521:ORCL", "TRMSApp",
					"TRMSApp123");
			String sqlStatement = "SELECT * FROM EMPLOYEE";
			PreparedStatement pstmt = conn.prepareStatement(sqlStatement);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				if(logInfo.getUsername().equals(rs.getString(4)) && logInfo.getPassword().equals(rs.getString(5))){
					System.out.println("ACCESS GRANTED");
					break;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

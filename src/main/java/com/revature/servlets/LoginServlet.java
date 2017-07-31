package com.revature.servlets;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.beans.Employee;
import com.revature.beans.LoginCred;
import com.revature.daoimplement.LoginDaoImplement;
import com.revature.daointerface.LoginDao;

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
		LoginDao ld = new LoginDaoImplement();
		Employee emp = ld.login(logInfo.getUsername(), logInfo.getPassword());
		if(emp != null){
			System.out.println("Access Granted");
		}else{
			
		}
		
		
	}

}

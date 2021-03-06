package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		pw.write("HI");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ObjectMapper om = new ObjectMapper();
		System.out.println(request.getParameter("login_cred"));
		LoginCred logInfo = om.readValue(request.getParameter("login_cred"),
				LoginCred.class);
		System.out.println(logInfo);
		LoginDao ld = new LoginDaoImplement();
		Employee emp = ld.login(logInfo.getUsername(), logInfo.getPassword());
		HttpSession hs = null;
		if (emp != null) {
			System.out.println("Access Granted");
			hs = request.getSession();
			hs.setAttribute("username", logInfo.getUsername());	
			System.out.println(hs.getAttribute("username"));
			response.setContentType("text/html");

			// New location to be redirected
			String site = new String("TRMSmenu.html");

			response.setStatus(response.SC_MOVED_TEMPORARILY);
			response.setHeader("Location", site);
		} else {
			response.setStatus(403);
		}

	}

}

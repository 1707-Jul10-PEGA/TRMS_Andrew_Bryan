package com.revature.daoimplement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.beans.Employee;
import com.revature.connection.ConnectionFactory;
import com.revature.daointerface.LoginDao;

public class LoginDaoImplement implements LoginDao {

	Connection conn;

	public LoginDaoImplement() {
		ConnectionFactory cf = ConnectionFactory.getInstance();
		conn = cf.getConnection();
	}

	public Employee login(String username, String password){
		// TODO Auto-generated method stub
		
		String sqlStatement = "SELECT * FROM EMPLOYEE";
		try{
		PreparedStatement pstmt = conn.prepareStatement(sqlStatement);
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()){
			if(username.equals(rs.getString(4)) && password.equals(rs.getString(5))){
				return new Employee(rs.getString(4), rs.getString(5), rs.getInt(1),
						rs.getString(2),rs.getString(3),rs.getInt(7),rs.getInt(8),rs.getInt(6));
			}
		}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return null;
	}
}

package com.revature.beans;

public class LoginCred {
	String username;
	String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginCred [username=" + username + ", password=" + password
				+ "]";
	}
	public LoginCred(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public LoginCred() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

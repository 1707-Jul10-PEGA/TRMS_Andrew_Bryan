package com.revature.beans;

public class Employee {
	String username;
	String password;
	int employee_id;
	String firstname;
	String lastname;
	int dept_id;
	int employee_type_id;
	int supervisor;
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
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public int getEmployee_type_id() {
		return employee_type_id;
	}
	public void setEmployee_type_id(int employee_type_id) {
		this.employee_type_id = employee_type_id;
	}
	public int getSupervisor() {
		return supervisor;
	}
	public void setSupervisor(int supervisor) {
		this.supervisor = supervisor;
	}
	@Override
	public String toString() {
		return "Employee [username=" + username + ", password=" + password
				+ ", employee_id=" + employee_id + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", dept_id=" + dept_id
				+ ", employee_type_id=" + employee_type_id + ", supervisor="
				+ supervisor + "]";
	}
	public Employee(String username, String password, int employee_id,
			String firstname, String lastname, int dept_id,
			int employee_type_id, int supervisor) {
		super();
		this.username = username;
		this.password = password;
		this.employee_id = employee_id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dept_id = dept_id;
		this.employee_type_id = employee_type_id;
		this.supervisor = supervisor;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

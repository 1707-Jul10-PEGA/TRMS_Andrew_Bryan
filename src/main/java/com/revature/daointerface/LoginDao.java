package com.revature.daointerface;

import com.revature.beans.Employee;

public interface LoginDao {

	public Employee login(String username, String password);
}

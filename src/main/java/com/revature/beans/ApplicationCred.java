package com.revature.beans;

public class ApplicationCred {
	double amount;
	String title;
	String grade;
	String details;
	
	
	/*
	 * Constructors
	 */
	
	public ApplicationCred() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ApplicationCred(double amount, String title, String grade, String details) {
		super();
		this.amount = amount;
		this.title = title;
		this.grade = grade;
		this.details = details;
	}
	
	/*
	 * Getters and Setters
	 */
	

	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
	/*
	 * to Sting Method
	 */
	
	@Override
	public String toString() {
		return "ApplicationCred [amount=" + amount + ", title=" + title + ", grade=" + grade + ", details=" + details
				+ "]";
	}
	
	
	
	
	
	
	
	
}

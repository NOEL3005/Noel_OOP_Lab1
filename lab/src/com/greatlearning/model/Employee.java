package com.greatlearning.model;

public class Employee {
	private String firstName;
	private String lastName;
	private String userEmail;
	private String password;
	public Employee() {}
	public Employee (String firstName,String lastName ,String userEmail,String password) {
		super();
		this.firstName= firstName;
		this.lastName= lastName;
		this.userEmail = userEmail;
		this.password = password;
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}

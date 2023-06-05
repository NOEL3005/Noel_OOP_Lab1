package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class EmployeeServiceImpl implements  EmployeeService{

	@Override
	public String generateUserEmail(String firstName, String lastName, String departmentName) {
		// TODO Auto-generated method stub
		return firstName + lastName +"@"+ departmentName + "gl.com";
	}

	@Override
	public String generateUserPassword() {
		String caps ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower ="abcdefghijklmnopqrstuvwxyz";
		String nums ="0123456789";
		String splchar ="!@#$%^&*()";
		String combined =caps+lower+nums+splchar;
		System.out.println(combined.length());
		String genPass="";
		Random random =new Random ();
		
		for(int i=1;i<=8;i++) {
			genPass += String.valueOf(combined.charAt(random.nextInt(combined.length())));
		}
		return genPass;
	}

	@Override
	public String displayEmployeeDetails(Employee e1) {
		// TODO Auto-generated method stub
		System.out.println("Employee firstName is: " +e1.getFirstName());
		System.out.println("Employee lastName is: " +e1.getLastName());
		System.out.println("Employee Email Id is: " +e1.getUserEmail());
		System.out.println("Employee password is: " +e1.getPassword());
		return null;
	}

}

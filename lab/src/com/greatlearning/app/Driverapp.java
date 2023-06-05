package com.greatlearning.app;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.greatlearning.model.Employee;
import com.greatlearning.service.EmployeeServiceImpl;

public class Driverapp {
	public static void main(String [] args ) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First Name");
		String fName = sc.next();
		System.out.println("Enter Last Name");
		String lName = sc.next();
		
		Employee emp =new Employee();
		emp.setFirstName(fName);
		emp.setLastName(lName);
		EmployeeServiceImpl esi = new EmployeeServiceImpl();
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resources");
		System.out.println("4. Legal");
		int choice = sc.nextInt();
		String gEmail="";
		String gPassword="";
		switch(choice) {
		case 1: gEmail = esi.generateUserEmail(emp.getFirstName().toLowerCase() , emp.getLastName().toLowerCase(), "tech") ;
			break;
		case 2:gEmail = esi.generateUserEmail(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(), "amin");
			break;
		case 3:gEmail = esi.generateUserEmail(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(), "Human Resources");
			break;
		case 4:gEmail = esi.generateUserEmail(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(), "legal");
			break;
		default:System.out.println("Please enter a valid input");
		}
		gPassword =esi.generateUserPassword();
		emp.setUserEmail(gEmail);
		emp.setPassword(gPassword);
		esi.displayEmployeeDetails(emp);
		String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)" + "(?=.*[-+_!@#$%^&*., ?]).+$";
		
		Pattern p = Pattern.compile(regex);
		 Matcher m = p.matcher(gPassword);
		 if (m.matches())
		            System.out.println("Valid Password");
		        else
		            System.out.println("inValid Password");
		}

}

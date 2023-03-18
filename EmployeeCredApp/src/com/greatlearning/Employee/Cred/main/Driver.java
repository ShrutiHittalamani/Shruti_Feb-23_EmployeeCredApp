package com.greatlearning.Employee.Cred.main;
import java.util.Scanner;

import com.greatlearning.Employee.Cred.service.*;
import com.greatlearning.Employee.Credentialservice.*;


public class Driver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CredentialService service=new CredentialServiceMpl();
		Employee emp=new Employee("Ram","Kumar");
		System.out.println("Please select the department");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.HumanResource");
		System.out.println("4.Legal");
		int choice=sc.nextInt();
		String department=null;
		switch(choice) {
		case 1:department="tech";
		break;
		case 2:department="admin";
		break;
		case 3:department="human resource";
		break;
		case 4:department="legal";
		break;
		default:
			System.out.println("please select valid output");
		}
		if(department != null) {
			emp.setDepartment(department);
		}
		String emailAddress=service.GenerateEmailAddress(emp);
		emp.setEmailAddress(emailAddress);
		String password=service.GeneratePassword();
		emp.setPassword(password);
		service.ShowCredentials(emp);
		
		
		

	}

}

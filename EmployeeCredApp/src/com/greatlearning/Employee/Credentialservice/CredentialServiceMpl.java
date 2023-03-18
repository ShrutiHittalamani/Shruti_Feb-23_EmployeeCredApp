package com.greatlearning.Employee.Credentialservice;

import java.util.Random;

import com.greatlearning.Employee.Cred.service.Employee;


public class CredentialServiceMpl implements CredentialService{
	private static final String COMPANY_DOMAIN =".gl.in";
	private static final int PASSWORD_SIZE =8;

	@Override
	public String GenerateEmailAddress(Employee employee) {
		String FirstName=employee.getFirstName();
		String LastName=employee.getLastName();
		String Department=employee.getDepartment();
		
		return FirstName+LastName+"@"+Department+COMPANY_DOMAIN;
	}

	@Override
	public String GeneratePassword() {
		String capitalCase="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallCase=capitalCase.toLowerCase();
		String nums="0123456789";
		String splChars="!@#$%&*^()";
		String passwordChars=capitalCase+smallCase+nums+splChars;
		String password = "";
		Random random = new Random();
		for(int i=0;i<PASSWORD_SIZE;i++) {
		password=password+passwordChars.charAt(random.nextInt(passwordChars.length()));
		}
		
		
		return password;
	}

	@Override
	public String ShowCredentials(Employee employee) {
		System.out.println("Dear "+employee.getFirstName() +"your generated credentials are as follows");
		System.out.println("email   -->"+employee.getEmailAddress());
		System.out.println("password   -->"+employee.getPassword());
		return null;
	}
	

}

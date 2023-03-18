package com.greatlearning.Employee.Credentialservice;

import com.greatlearning.Employee.Cred.service.Employee;

public interface CredentialService {
	public String GenerateEmailAddress(Employee employee);
	public String GeneratePassword();
	public String ShowCredentials(Employee employee);

}

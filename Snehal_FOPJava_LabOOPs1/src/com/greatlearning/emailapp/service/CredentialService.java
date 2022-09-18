package com.greatlearning.emailapp.service;

import com.greatlearning.emailapp.model.Employee;

public interface CredentialService {
public String generatePassword();
public String generateEmailAddress(String firstName, String lastName,String department);
public void showCredentials(Employee e);
}

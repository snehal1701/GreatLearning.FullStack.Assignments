package com.greatlearning.emailapp.service;

import java.util.Random;

import com.greatlearning.emailapp.model.Employee;

public class CredentailServiceImpl implements CredentialService {
	private String domain;

	public CredentailServiceImpl(String domain) {
		super();
		this.domain = domain;
	}

	@Override
	public String generatePassword() {
		// TODO Auto-generated method stub
		Random random = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= 8; i++) {
			int n = random.nextInt(127 - 32) + 32;
			sb.append((char) n);
			
		}
		return sb.toString();
	}

	@Override
	public String generateEmailAddress(String firstName, String lastName, String department) {
		// TODO Auto-generated method stub
		return firstName.toLowerCase() + lastName.toLowerCase() + "@" + department + "." + domain;
}

	@Override
	public void showCredentials(Employee e) {
		// TODO Auto-generated method stub
		System.out.println("Dear " + e.getFirstName() + ", your generated credentials are as follows,");
		System.out.println("Email   ---> " + e.getEmailId());
		System.out.println("Password   ---> " + e.getPassword());

	}

}

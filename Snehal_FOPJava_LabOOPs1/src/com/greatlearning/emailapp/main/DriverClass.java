package com.greatlearning.emailapp.main;

import java.util.Scanner;

import com.greatlearning.emailapp.model.Employee;
import com.greatlearning.emailapp.service.CredentailServiceImpl;
import com.greatlearning.emailapp.service.CredentialService;

public class DriverClass {
	public static final String[] Departments = { "Technical", "Admin", "Human Resource", "Legal" };
	public static final String[] DepartmentAbbr = { "tech", "adm", "hr", "lg" };

	public static void main(String[] args) {
		CredentialService service = new CredentailServiceImpl("abc.com");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Name");
		String fname = scanner.next();
		System.out.println("Enter Last Name");
		String lname = scanner.next();
		Employee e = new Employee(fname, lname);

		// Show the menu for Departments
		System.out.println("Enter the Department from the following");
		for (int i = 1; i <= Departments.length; i++) {
			System.out.println(i + ". " + Departments[i-1]);
		}
		int deptIndex = scanner.nextInt() - 1;
		scanner.close();
		e.setDepartment(DepartmentAbbr[deptIndex]);
		String emailID = service.generateEmailAddress(e.getFirstName(), e.getLastName(), e.getDepartment());
		e.setEmailId(emailID);
		String password = service.generatePassword();
		e.setPassword(password);

		service.showCredentials(e);

	}

}

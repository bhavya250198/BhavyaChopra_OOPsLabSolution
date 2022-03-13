package com.credentials.main;
import java.util.*;

import com.credentials.model.Employee;
import com.credentials.service.CredentialService;

public class EmployeeDetailsController {
		static int password=8;
		public static void showWindow() {
			Scanner sc = new Scanner(System.in);
			String firstName = sc.nextLine();
			String lastName = sc.nextLine();
			Employee employee = new Employee(firstName,lastName);
	CredentialService cred = new CredentialService();
	System.out.println("Please Enter the Department from the following");
	System.out.println("1. Technical\n2. Admin\n3. Human Resources\n4. Legal");
	int option = sc.nextInt();
	String email="";
	String passwordDetails="";
	switch(option) {
	case 1:
		 email=cred.generateEmail(employee,"tech","abc");
	     passwordDetails = cred.generatePassword(password);
	    cred.showCredentials(employee,email,passwordDetails);
		break;
	case 2:
		 email=cred.generateEmail(employee,"admin","abc");
	     passwordDetails = cred.generatePassword(password);
	    cred.showCredentials(employee,email,passwordDetails);
		break;
	case 3:
		 email=cred.generateEmail(employee,"HR","abc");
	     passwordDetails = cred.generatePassword(password);
	    cred.showCredentials(employee,email,passwordDetails);
		break;
	case 4:
		 email=cred.generateEmail(employee,"Legal","abc");
	     passwordDetails = cred.generatePassword(password);
	    cred.showCredentials(employee,email,passwordDetails);
		break;
	 default:
		 System.out.println("Invalid Department");
		break;
	}
		}
		public static void main(String args[]) {
			try {
				
			       
				showWindow();
			    
			}
				 catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
}

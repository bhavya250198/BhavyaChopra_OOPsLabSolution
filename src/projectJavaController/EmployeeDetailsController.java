package projectJavaController;

import projectJavaService.CredentialService;

public class EmployeeDetailsController {
		static String firstName="Bhavya";
		static String lastName="Chopra";
		static String department="Technical";
		static String company="ABC";
		static int password=8;
		public static void main(String args[]) {
			try {
			CredentialService cred = new CredentialService();
			       
				String email=cred.generateEmail(firstName,lastName,department,company);
			    String passwordDetails = cred.generatePassword(password);
			    cred.showCredentials(email,passwordDetails);
			}
				 catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
}

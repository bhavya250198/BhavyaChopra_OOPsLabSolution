package projectJavaService;
import java.util.*;
public class CredentialService {

	public String generateEmail(String firstName,String lastName,String department,String company ) {
		String emailAddress = (firstName+lastName+"@"+department+"."+company+"."+"com").toLowerCase();
		return emailAddress;
		
	}
	public String generatePassword(int len) {
		 String capitalChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	     String smallChars = "abcdefghijklmnopqrstuvwxyz";
	     String numbers = "0123456789";
	     String symbols = "!@#$%^&*_=+-/.?<>)";
	     String values = capitalChars + smallChars +numbers + symbols;
	     Random randomMethod = new Random();
	     char[] password = new char[len];
	     String passwordDetails="";
	     for (int i = 0; i < len; i++)
	        {
	            
	            password[i] =
	              values.charAt(randomMethod.nextInt(values.length()));
	            passwordDetails+=password[i];
	  
	        }
	     return passwordDetails;
	}
	public void showCredentials(String email,String password) {
		System.out.println("Dear User your Credentials are as follows");
		System.out.println("Email Address"+":"+email);
		System.out.print("Password"+":"+password);
		
	}
}

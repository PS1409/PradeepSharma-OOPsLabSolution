package com.greatlearning.service;
import com.greatlearming.model.*;
import java.util.Random;

public class CredentialService {

	final String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	final String smallLetters = "abcdefghijklmnopqrstuvwxyz";
	final String numbers = "0123456789";
	final String specialChars = "~!@#$%^&*()_+?<>";
	Random rndm = new Random();
	
	final String allowedChars = capitalLetters+smallLetters+numbers+specialChars;
	
	
	//Display the Credentials 
	public void showCredentials(Employee employee, String email, String password) {
		System.out.println("Dear " +  employee.getFirstName() + " your generated credentials are as follows");
	    System.out.println("Email  --->  " +  email);
	    System.out.println("Password ---> " +  password);
	 }
	
	
	//Generate email and return
	 public String generateEmailAddress(Employee employee) {
		 //return the email id
		 return employee.getFirstName().toLowerCase()+employee.getLastName().toLowerCase()+"@"+employee.getDepartment().toLowerCase()+".abc.com";
	 }
	 
	 //generate the random password
	 public String generatePassword() {
		 //generate random password
		 
		 char[] password = new char[8];
		 for(int i=0;i<8;i++) {
			 if(i==1){
				 int indx = rndm.nextInt(specialChars.length()) ;
					password[i] = specialChars.charAt(indx);
			 }
			 else if(i==3){
				 int indx = rndm.nextInt(capitalLetters.length()) ;
					password[i] = capitalLetters.charAt(indx);
			 }
			 else if(i==5){
				 int indx = rndm.nextInt(numbers.length()) ;
					password[i] = numbers.charAt(indx);
			 }
			 else if(i==7){
				 int indx = rndm.nextInt(smallLetters.length()) ;
					password[i] = smallLetters.charAt(indx);
			 }
			 else {
				int indx = rndm.nextInt(allowedChars.length()) ;
				password[i] = allowedChars.charAt(indx);
			 }
		 }
		 return new String(password);
	 } 
	 
}

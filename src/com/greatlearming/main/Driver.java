package com.greatlearming.main;
import java.util.Scanner;
import com.greatlearming.model.Employee;
import com.greatlearning.service.CredentialService;

public class Driver {
	
	private static Scanner scanner=  new Scanner(System.in);
	
	public static void main(String[] args) {
		// Take inputs from user for firstName, lastName and department choice [1,2,3,4]
		 Employee employee = GetEmployeeInformationFromUser();	
		 if(employee != null)
		 {
			 CredentialService cred =  new CredentialService();
			 String email = cred.generateEmailAddress(employee);
			 String password = cred.generatePassword();
			 cred.showCredentials(employee, email, password);			
		 }

	}
	
	private static Employee GetEmployeeInformationFromUser() {
		Employee emp;
		System.out.println("Please enter first name");
		String fistName = scanner.next();
		System.out.println("Please enter last name");
		String lastName = scanner.next();
		String department = "";
		System.out.println("Please enter department");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		int choice =  scanner.nextInt();
		switch(choice) {
		case 1 :
			 department = "tech";
			break;
		case 2 :
			 department = "adm";
			break;
		case 3 :
			 department = "hr";
			break;
		case 4 :
			 department = "lg";
			break;
			default:
				System.out.println("Invalid choice");
				break;
		}
			if(department !="") {
			emp =  new Employee(fistName, lastName, department);
			return emp;
		}
			
			return null;
	}

}

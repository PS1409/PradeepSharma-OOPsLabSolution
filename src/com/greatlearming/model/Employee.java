package com.greatlearming.model;

public class Employee {
   //Declare firstName, lastName, departmentName
	private String firstName;
	private String lastName;
	private String department;
	
	// Create he constructor	
	public Employee(String _firstName, String _lastName, String _department)
	{
		firstName = _firstName;
		lastName = _lastName;
		department = _department;
	}
	
	//Create the getter and setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String _firstName) {
		firstName = _firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String _lastName) {
		lastName = _lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String _department) {
		department = _department;
	}
}

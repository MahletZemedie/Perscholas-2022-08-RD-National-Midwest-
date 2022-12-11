package com.perscholas.practiceSBA;

/*
 * @ author- Mahlet Zemedie
 * Date - 12/10/2022
 */

import java.util.ArrayList;

public class Employee {
	
	String firstName;
	String lastName;
	String department;
	
	public Employee(String firstName, String lastName, String department) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		
		
	}
	public Employee() {
		
	}
	
	@Override
	public String toString() {
		return "firstName=" + firstName + ", lastName=" + lastName + ", department=" + department;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public ArrayList<Employee> addEmployes (String[] first,String[] last, String[] department){
		   ArrayList<Employee> employees = new ArrayList<>();
		   
		   for(int i=0; i<first.length; i++) {
			   Employee employe = new Employee(first[i], last[i], department[i]);
			   employees.add(employe);
		   }
		   
		   return employees ;
		}
	
	public void removeEmployee() {
		
		
	}
	
	public static void main(String [] args) {
		
		String[] firstName = {"Harold", "Luciano", "Tyree", "Nyla", "Natalie", "Quincy", "Devyn", "Aliana"};
		 
		String[] lastName = {"Riddle", "Zavala", "Ho", "Saunders", "Morgan", "Schroeder", "Nolan", "Orr"};
		 
		String[] department = {"production", "r&d", "sales", "marketing", "human resources", "accounting", "sales", "r&d"};

		Employee employe1 = new Employee("Mahlet", "Zemedie", "CS");//if we want to add a single employee
		Employee employe2 = new Employee(); //for batch insertion 
		//System.out.println(employe.toString());
		System.out.println(employe1);
		System.out.println(employe2.addEmployes(firstName, lastName, department));
	}


}

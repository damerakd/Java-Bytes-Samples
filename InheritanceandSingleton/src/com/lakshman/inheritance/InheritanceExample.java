package com.lakshman.inheritance;

import java.util.Scanner;

public class InheritanceExample {
 
	public static void main(String[] args) {
	System.out.println("I am from Main method");
	//PEmployee pEmployee = new PEmployee(100, "Lakshman", "Developer", "QWERTY123", 10, 90.00d, 100d);
	//pEmployee.doSalaryCalculation();
	//pEmployee.displaySalaryStatement();
	//pEmployee.setEmpPassword("Mahipal");
	//System.out.println(pEmployee.getEmpPassword());
	//CEmploye cEmployee = new CEmploye(empNumber, empName, empJob, empPassword, empDeptNumber, perDaySalary, numberofDays)

	
	// DYNAMIC BINDING --- KNOWS WHICH OBJECT TO CREATE AT RUN TIME AND CALLS THE CORRESPONDING METHODS IN CLASSES
	Employee employee =  null;
	System.out.println("Enter the Type of Employee");
	Scanner scanner = new Scanner(System.in);
	String empType = scanner.next();
	if("PEmployee".equals(empType)) {
		employee = new PEmployee(100, "Lakshman", "Developer", "QWERTY123", 10, 90.00d, 100d);
	}
	else if ("CEmployee".equals(empType)) {
		employee = new CEmploye(200, "Damera Mahipal", "Engineer", "Apple@123", 20, 10, 16);
	}
	else {
		System.err.println("Enter Correct Type of Employee");
		System.exit(0);
	}
	employee.doSalaryCalculation();
	employee.displaySalaryStatement();
	scanner.close();
	System.out.println("End of Main Method");
  }
}

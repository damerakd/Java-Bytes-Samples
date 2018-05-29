package com.lakshman.inheritance;

public abstract class Employee {

	int empNumber;
	String empName;
	String empJob;
	String color = "Blue";
	private String empPassword;
	int empDeptNumber;
	/**
	 * @return the empPassword
	 */
	public String getEmpPassword() {
		return empPassword;
	}
	
	//Employee()
	//{
		
	//}
	/**
	 * @param empPassword the empPassword to set
	 */
	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}
	
	
	//abstract method
	public abstract void doSalaryCalculation();
	/**
	 * @param empNumber
	 * @param empName
	 * @param empJob
	 * @param empPassword
	 * @param empDeptNumbr
	 */
	public Employee(int empNumber, String empName, String empJob, String empPassword, int empDeptNumber) {
		System.out.println("From Employee Constructor");
		this.empNumber = empNumber;
		this.empName = empName;
		this.empJob = empJob;
		this.empPassword = empPassword;
		this.empDeptNumber = empDeptNumber;
	}
	
	public void displaySalaryStatement() {
		System.out.println("Employee Number"+"\t"+empNumber);
		System.out.println("Employee Name"+"\t"+empName);
	}
}

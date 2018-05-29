package com.lakshman.inheritance;

public class CEmploye extends Employee{

	float perDaySalary;
	float numberofDays;
	/**
	 * @param empNumber
	 * @param empName
	 * @param empJob
	 * @param empPassword
	 * @param empDeptNumber
	 * @param perDaySalary
	 * @param numberofDays
	 */
	public CEmploye(int empNumber, String empName, String empJob, String empPassword, int empDeptNumber,
			float perDaySalary, float numberofDays) {
		//super at constructor level
		super(empNumber, empName, empJob, empPassword, empDeptNumber);
		this.perDaySalary = perDaySalary;
		this.numberofDays = numberofDays;
	}
	
	@Override
	public void displaySalaryStatement() {
		super.displaySalaryStatement();
		System.out.println("I am from Display Salary Statement of CEmployee Class");
	}
	public void doSalaryCalculation() {
		if(numberofDays > 15) {
			perDaySalary = Math.round(perDaySalary + perDaySalary*3 + 1000);
		}
		else {
			perDaySalary = Math.round(perDaySalary * 2);
		}
	}
	
}

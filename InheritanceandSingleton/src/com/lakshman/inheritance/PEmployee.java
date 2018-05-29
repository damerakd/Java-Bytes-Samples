package com.lakshman.inheritance;

public class PEmployee extends Employee {
	double empBasic;
	double empCommission;
	String color = "Green";
	double takeHomeSalary;
	final int COURSE_FEE = 1000; // final at variable level
	public final double finalCourseFee(){ // final at method level -- sub class cannot override thsi method
		return 1.00;
	}
	/**
	 * @param empNumber
	 * @param empName
	 * @param empJob
	 * @param empPassword
	 * @param empDeptNumbr
	 * @param empbasic
	 * @param empCommission
	 */
	public PEmployee(int empNumber, String empName, String empJob, String empPassword, int empDeptNumbr,
			double empBasic, double empCommission) {	
		//super at constructor level
		super(empNumber, empName, empJob, empPassword, empDeptNumbr);
		System.out.println("From PEmployee Constructor");
		this.empBasic = empBasic;
		this.empCommission = empCommission;
		System.out.println("Color from Derived Class: "+ color);
		System.out.println("Color from Base Class: "+super.color);  // Super at variable level
	}
	
	public void doSalaryCalculation() {
		if(empDeptNumber == 10) {
			takeHomeSalary = Math.round(empBasic + empBasic*3 + empCommission);
		}
		else {
			takeHomeSalary = Math.round(empBasic + empCommission);
		}
	}
	
	@Override
	public void displaySalaryStatement() {
		super.displaySalaryStatement(); // super at method level
		System.out.println("Employee Basic"+"\t"+empBasic);
		System.out.println("Employee Comission"+"\t"+empCommission);
		System.out.println("Employee takehomesalary"+"\t"+takeHomeSalary);
	}

	
	

}

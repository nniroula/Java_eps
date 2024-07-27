package epsV2;


public class PayrollRunner {
	public static void main(String[] args) {
		System.out.println("	****** Employee Payroll System - OOPS Project ******");
		
		// create a full time employee
		FullTimeEmployee fullTimeEmployeeObject = new FullTimeEmployee("Nabin", 01, 655.00);
		
		
		
		// create a part time employee
		PartTimeEmployee partTimeEmployeeObject = new PartTimeEmployee("John Doe", 2, 10, 12.5);
		
		// Payroll System
		EmployList ps = new EmployList();
		
		// add Employees
		ps.addEmployee(fullTimeEmployeeObject);
		ps.addEmployee(partTimeEmployeeObject);
		
		// display employee list
		System.out.print(ps.displayListOfEmployees());
		System.out.println();
		System.out.println(ps.removeEmployee(1));
		System.out.print(ps.displayListOfEmployees());
		
	}
}

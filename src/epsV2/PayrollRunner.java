package epsV2;

/* Main App Class */
public class PayrollRunner {
	public static void main(String[] args) {
		System.out.println("****** Employee Payroll System App - Version 2 ******");
		// Employee List
		EmployList employeeList = new EmployList();
		System.out.print(employeeList.displayListOfEmployees()); // display employee list
		System.out.println();
		
		/*Part time employee Data I/O */
		PartTimeEmployeeDataIO partTimeEmployeeDataIO = new PartTimeEmployeeDataIO();
		Employee newPartTimeAssociate = partTimeEmployeeDataIO.createPartTimeEmployee(); //create a part time employee
		employeeList.addEmployee(newPartTimeAssociate);	
		
		/* Full time employee */
		FullTimeEmployeeDataIO fullTimeEmployeeDataIO = new FullTimeEmployeeDataIO();
		Employee newFullTimeAssociate = fullTimeEmployeeDataIO.createFullTimeEmployee(); //create a full time employee
		employeeList.addEmployee(newFullTimeAssociate);
		
		
		/* display employee list */
		System.out.print(employeeList.displayListOfEmployees());
		System.out.println();
		
		/* display salary */
		String partTimeAssociateSalary = newPartTimeAssociate.displaySalary();
		System.out.println(partTimeAssociateSalary);
		
		String fullTimeAssociateSalary = newFullTimeAssociate.displaySalary();
		System.out.println(fullTimeAssociateSalary);
		
	}
}

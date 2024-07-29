package epsV2;

class PartTimeEmployeeData{
	Scanner sc = new Scanner(System.in);
	// create a part time employee
	PartTimeEmployee partTimeEmployeeObject = new PartTimeEmployee("John Doe", 2, 10, 12.5);
	
	private static void createPartTimeEmployee() {
		String name;
		int id;
		int hoursWorked;
		double hourlyWage;
		
		//PartTimeEmployee(String name, int id, int workedHours, double hourlyRate){
		System.out.println("Enter employee name: ");
		//String name = 
	}
}


public class PayrollRunner {
	public static void main(String[] args) {
		System.out.println("	****** Employee Payroll System App - Version 2 ******");
		
		// create a full time employee
		FullTimeEmployee fullTimeEmployeeObject = new FullTimeEmployee("Nabin", 01, 655.00);
		
		
		
		// create a part time employee
		PartTimeEmployee partTimeEmployeeObject = new PartTimeEmployee("John Doe", 2, 10, 12.5);
		
		// Payroll System
		EmployList employeeList = new EmployList();
		
		// add Employees
		employeeList.addEmployee(fullTimeEmployeeObject);
		employeeList.addEmployee(partTimeEmployeeObject);
		
		// display employee list
		System.out.print(employeeList.displayListOfEmployees());
		System.out.println();
		System.out.println(employeeList.removeEmployee(1));
		System.out.print(employeeList.displayListOfEmployees());
		
	}
}

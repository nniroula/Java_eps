package epsV3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class JdbcRunner {
	public void setupJdbc() {
		String jdbcUrl = "jdbc:mysql://localhost:3306/eps_db"; // Replace eps_db with your database name
		String username = "root"; // Replace root with your mysql username
		String password = "root"; // Replace root with your mySQl password
		
		/* insert queries -> executeUpdate() */
		String insertQueryOne = "INSERT INTO employee(employee_id, name, status, payRate) VALUES(1, 'Nabin', 'Full Time', 5000)";
		String insertQueryTwo = "INSERT INTO employee(employee_id, name, status, payRate) VALUES(2, 'John Doe', 'Part Time', 17.34)";
		
		// ----- user input values. Get from console -------
		int associateId = 3;
		String associateName = "Persistent Coding";
		String status = "Salaried";
		String payRate = "7000.524";
		String insertQueryThree = "INSERT INTO employee VALUES(?, ?, ?, ?)"; 
		
		/* select queries */
		String selectQuery = "SELECT * FROM employee";
		
		try {
			//1. load the jdbc driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. create connection
			Connection con = DriverManager.getConnection(jdbcUrl, username, password);
			
			PreparedStatement preparedStatementInsertOne = con.prepareStatement(insertQueryOne);
			con.prepareStatement(insertQueryTwo);
			PreparedStatement preparedStatementInsertThree = con.prepareStatement(insertQueryThree);
			
			/* INSERT, DELETE, and UPDATE Queries */
			int numbersOfRowsAffected = preparedStatementInsertOne.executeUpdate(insertQueryOne);
			int resultTwo = preparedStatementInsertOne.executeUpdate(insertQueryTwo);
			
			// with positional parameters - Dynamic way
			preparedStatementInsertThree.setInt(1, associateId);
			preparedStatementInsertThree.setString(2, associateName);
			preparedStatementInsertThree.setString(3, status);
			preparedStatementInsertThree.setString(4, payRate);
			preparedStatementInsertThree.executeUpdate(); // you do not have to pass in insertQueryThree as it is already passed in above
			
			if(numbersOfRowsAffected > 0){
				System.out.println("result = " + numbersOfRowsAffected);
				System.out.print(", JDBC Connection Successful"); 
			}else if(numbersOfRowsAffected < 0) {
				System.out.println("Failure of jdbc connection");
				System.out.println("result = " + numbersOfRowsAffected);
			}
			
			
			/* SELECT Query */
			ResultSet resultSet = preparedStatementInsertOne.executeQuery(selectQuery);
			int empoyeeIdFromResultSet;
			String employeeNameFromResultSet;
			while(resultSet.next()) {
				empoyeeIdFromResultSet = resultSet.getInt("employee_id");
				employeeNameFromResultSet = resultSet.getString("name");
				System.out.printf("employee id = %d, name = %s", empoyeeIdFromResultSet, employeeNameFromResultSet);
				System.out.println();
			}
			preparedStatementInsertOne.close();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}

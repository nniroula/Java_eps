#### Employee Payroll System 
An Employee Payroll System App that calculates the gross pay of an employee
<hr>

#### Version-1 (epsV1) 

- This version implements OOP concepts and Static List:-
	- ``Encapsulation`` - private access modifier for instance variables <br>
	- ``Polymorphism`` - abstract method @Override <br>
	- ``Inheritance`` - extends keyword <br>
	- ``Abstraction`` - abstract class inherited in another class and abstract method overridden <br>
	- ``List`` - List data structure to hold employees
	
<hr>	

#### Version-2 (epsV2) 

- This version implements OOP concepts plus following:- 
	- ``I/O`` - gets user input <br>
	- ``Separation of Concern, abstraction and code modularization`` <br>
	
<hr>

#### Version-3 (epsV3) 

- This version implements the following:- 
	- ``JDBC`` - Java Database Connectivity <br>
		a. use ``MYSQL`` ``RDBMS``. Download MySQL connector jar <br>
		b. add the jar file to the project as an external jar <br>
		c. create a database, database table and connect to that database. <br>
	- ``JDBC`` implementation is ready to work on dynamic data <br>

<hr>

#### Version-4 (epsV4) 

- This version:- 
	- takes in console input and updates database table accordingly <br>
	- Implements ``JDBC CRUD`` operations <br>
	- To implement Delete and Update functionalities, uncomment the code in eps4>JdbcRunner.java file
	
<hr>

#### How to run the project so far? 
- Open this project in Eclipse and run it there
- Open up terminal in your device and type ``mysql`` and hit enter <br>
	-- Then run the command: ``source seed.sql;`` <br>
	-- Run the command ``use eps_db(your database name);`` to connect to your database <br>
	-- ``SELECT * FROM employee(or your table name);`` to display the list of items from the database table <br>
	-- Then run the project in Eclipse and provide console input. Check the table as above for the update.


#### Version-5 (epsV5) 

- This version implements the following:- 
	- ``NoSQL database`` - implements MongoDB <br>
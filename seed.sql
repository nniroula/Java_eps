DROP DATABASE IF EXISTS eps_db;
create database eps_db;
use eps_db;


DROP TABLE IF EXISTS employee;

CREATE TABLE employee(employee_id INTEGER, name VARCHAR(50), status VARCHAR(50), payRate VARCHAR(25));

		
				
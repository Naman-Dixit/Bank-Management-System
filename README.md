ATM System using JDBC
##
This is a simple ATM System built using Java and JDBC. It allows users to create accounts, log in with a PIN, check balance, deposit, withdraw money, update PIN, and delete accounts. The system interacts with a MySQL database to manage account information.
##
🚀 Features
Create a new account

Login with account number and PIN

Deposit and withdraw money

Check account balance

Update PIN

Delete account
##
🛠️ Technologies Used
Java

JDBC

MySQL
##
🧑‍💻 How to Run
Set up the MySQL database:

sql:-

CREATE DATABASE atm_db;

USE atm_db;

CREATE TABLE accounts (
    account_no INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    pin INT,
    balance DOUBLE
);
Update database credentials in the Java code:

java:-

String url = "jdbc:mysql://localhost:3306/atm_db";
String user = "root";
String pass = "your_password";

Compile and run the Java files using your preferred IDE or terminal.
##
Learning Highlights:-

Basic JDBC operations
Simple CRUD using Java
Console-based application flow
##
📌 Requirements
Java 8 or above

MySQL

JDBC Driver (MySQL Connector/J)


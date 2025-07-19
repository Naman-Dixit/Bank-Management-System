CREATE database bankmanagementsystem;
Show databases;
use bankmanagementsystem;

CREATE TABLE signup (
    formno VARCHAR(20),
    name VARCHAR(50),
    father_name VARCHAR(50),
    dob VARCHAR(20),
    gender VARCHAR(10),
    email VARCHAR(100),
    marital_status VARCHAR(20),
    address VARCHAR(100),
    city VARCHAR(50),
    pincode INT,
    state VARCHAR(50)
);

show tables;

select * from signup;

ALTER TABLE signup
ADD PRIMARY KEY (formno);

CREATE TABLE signuptwo (
    formno VARCHAR(20),
    religion VARCHAR(20),
    category VARCHAR(20),
    income VARCHAR(30),
    education VARCHAR(30),
    occupation VARCHAR(30),
    pan_number VARCHAR(20),
    adhaar_number VARCHAR(20),
    senior_citizen VARCHAR(5),
    existing_account VARCHAR(5),
    PRIMARY KEY (formno),
    FOREIGN KEY (formno) REFERENCES signup(formno)
);

show tables;

select * from signuptwo;

-- Check if formno is a primary key in signup table
SHOW CREATE TABLE signuptwo;


DESCRIBE signuptwo;

SHOW CREATE TABLE signuptwo;

ALTER TABLE signup ADD PRIMARY KEY (formno);

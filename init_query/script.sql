DROP TABLE if exists students;

CREATE TABLE students(
                              id bigint(20) NOT NULL AUTO_INCREMENT,
                              name varchar(100) DEFAULT NULL,
                              age integer DEFAULT NULL,
                              gender varchar(1) DEFAULT NULL,
                              email varchar(100) DEFAULT NULL,
                              address varchar(100) DEFAULT NULL,
                              degree varchar(100) DEFAULT NULL,
                              PRIMARY KEY (id)
);

-- Insert dummy data into the students table
INSERT INTO students (name,gender, age, email, contact_num,address,degree) VALUES ('Duasha Indeewarie','F', 22, 'duashaindeewarie@gmail.com','0774176502','Weligama','Bsc in Computer Science');
INSERT INTO students (name,gender, age, email, contact_num,address,degree) VALUES ('Dilakshan Chandrasena','M', 22,'dilakshanchandrasena@gmail.com' ,'0774176432', 'Colombo','Bsc in Computer Science');
INSERT INTO students (name,gender, age, email, contact_num, address,degree) VALUES ('Aneeq Ahammed','F', 18,'aneeq123@gmail.com' , '0725667502','Negombo','Bsc in Aritificial Intelligence');
INSERT INTO students (name,gender, age, email, contact_num, address,degree) VALUES ('Alia SIngh','F', 20,'alia4@gmail.com' ,'0774146802', 'Kandy','Bsc in Software Engineering');
INSERT INTO students (name,gender, age, email, contact_num, address,degree) VALUES ('Muzni Maznavi','M', 22,'muznim2@gmail.com' ,'0713678965', 'Matara','Bsc in Computer Science');

/*insert the following record into the users table to get logging credentials
    Email: admin@ac.uk
    Password: admin@123

    Use these credentials to log in to the application
*/
 insert into users(email,password,role) values ('admin@ac.uk','admin@123','admin');
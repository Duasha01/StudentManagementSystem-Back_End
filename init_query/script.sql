DROP TABLE if exists student_details;

CREATE TABLE student_details (
                              id bigint(20) NOT NULL AUTO_INCREMENT,
                              name varchar(100) DEFAULT NULL,
                              age integer DEFAULT NULL,
                              gender varchar(1) DEFAULT NULL,
                              email varchar(100) DEFAULT NULL,
                              address varchar(100) DEFAULT NULL,
                              degree varchar(100) DEFAULT NULL,
                              PRIMARY KEY (id)
);

-- Insert dummy data into the student_details table
INSERT INTO student_details (id, name,gender, age, email, address,degree) VALUES ('1', 'Duasha','F', 22, 'duashaindeewarie@gmail.com','Weligama','Bsc in Computer Science');
INSERT INTO student_details (name,gender, age, email, address,degree) VALUES ('Dilakshan','M', 22,'dilakshanchandrasena@gmail.com' , 'Colombo','Bsc in Computer Science');
INSERT INTO student_details (name,gender, age, email, address,degree) VALUES ('Aneeq','F', 18,'aneeq123@gmail.com' , 'Negombo','Bsc in Aritificial Intelligence');
INSERT INTO student_details (name,gender, age, email, address,degree) VALUES ('Alia','F', 20,'alia4@gmail.com' , 'Kandy','Bsc in Software Engineering');
INSERT INTO student_details (name,gender, age, email, address,degree) VALUES ('Muzni','M', 22,'muznim2@gmail.com' , 'Matara','Bsc in Computer Science');

/*insert following record into the users table to get logging credentials
    Email: admin@ac.uk
    Password: admin@123

    Use these credentials to log in to the application
*/
 insert into users(email,password,role) values ('admin@ac.uk','admin@123','admin');
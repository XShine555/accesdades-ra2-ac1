--DROP TABLE IF EXISTS students;
CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nom VARCHAR(100) NOT NULL,
    cognom VARCHAR(100),
    age INT NOT NULL CHECK (age > 0),
    cicle VARCHAR(100) NOT NULL,
    any INT NOT NULL CHECK (any >= 0)
);

--DROP TABLE IF EXISTS customers;
--CREATE TABLE customers (
--    id BIGINT AUTO_INCREMENT PRIMARY KEY,
--    name VARCHAR(100) NOT NULL,
--    age INT DEFAULT 0
--);
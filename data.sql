CREATE DATABASE IF NOT EXISTS testdb;

USE testdb;

CREATE TABLE IF NOT EXISTS demo_entity (
    id INT PRIMARY KEY,
    centre_name VARCHAR(255),
    centre_address VARCHAR(255)
);

# Java-Spring-Boot-Backend-Application
This project is a backend-only application built using Spring Boot and MySQL, exposing RESTful APIs tested via Postman. It handles business logic, database operations, and API responses, and is designed to be consumed by any frontend or client application.

Features

Employees

Add, update, delete, and list employees

Manage employee details (name, email, designation, salary, etc.)

Update employee status (Active, Inactive)

Roles / Designations

Add and manage employee roles/designations

Assign roles to employees

Tech Stack

Backend: Java, Spring Boot

Database: MySQL

Build Tool: Maven

API Testing: Postman

Prerequisites

Java 11+ installed

Maven installed

MySQL installed and running

Configuration

Update src/main/resources/application.properties with your MySQL credentials:

spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/employee_management_system?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

server.port=8080
spring.jpa.show-sql=true

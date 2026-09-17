# Student Management System

A Java-based Student Management System that allows users to manage student records using CRUD operations. The application uses JDBC to connect Java with a MySQL database.

## Features

- Add new student records
- View all students
- Search students by ID
- Update student details
- Delete student records
- Persistent data storage using MySQL
- Database connectivity using JDBC
- Parameterized SQL queries using PreparedStatement

## Technologies Used

- **Java** – Application development
- **JDBC** – Database connectivity
- **MySQL** – Data storage
- **Git & GitHub** – Version control

## Project Structure

```text
Student-Management-System
│
├── database.sql
├── .gitignore
│
└── src
    ├── DBConnection.java
    ├── Main.java
    ├── Student.java
    └── StudentDAO.java
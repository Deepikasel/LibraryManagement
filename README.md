# 📚 Library Management System (Java + MySQL)

A **console-based Library Management System** built using **Java**, **JDBC**, and **MySQL**, following a **layered architecture** (Controller → Service → Repository).

This project demonstrates **CRUD operations**, database connectivity, and clean code structure suitable for learning and interviews.

---

## 🚀 Features

- ➕ Add Book  
- 📖 View All Books  
- ✏️ Update Book  
- ❌ Delete Book  
- 💾 Persistent storage using MySQL  

---

## 🏗️ Project Structure

LibraryManagement/
│
├── src/
│ ├── Main.java
│ ├── controller/
│ │ └── LibraryController.java
│ ├── service/
│ │ └── BookService.java
│ ├── repository/
│ │ └── BookRepository.java
│ ├── model/
│ │ └── Book.java
│ └── util/
│ └── DBConnection.sample.java
│
├── lib/
│ └── mysql-connector-j-9.2.0.jar
│
├── .gitignore
└── README.md


---

## 🛠️ Technologies Used

- Java (Core Java)
- JDBC
- MySQL
- Git & GitHub
- Command Line (Windows)

---

## 🗄️ Database Setup

### 1️⃣ Create Database
```sql
CREATE DATABASE librarydb_db;
USE librarydb_db;
2️⃣ Create Table
CREATE TABLE books (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(100),
    author VARCHAR(100),
    year INT
);
## ⚙️ Configuration

# Copy:

DBConnection.sample.java

# Rename it to:

DBConnection.java
## Update your MySQL credentials:
private static final String USER = "root";
private static final String PASS = "your_mysql_password";
## ▶️ How to Run
# 1️⃣ Compile
javac -cp ".;lib/mysql-connector-j-9.2.0.jar" src/Main.java src/controller/*.java src/service/*.java src/repository/*.java src/model/*.java src/util/*.java

# 2️⃣ Run
java -cp ".;lib/mysql-connector-j-9.2.0.jar;src" Main
## 📸 Sample Menu Output
------ Library Management ------
1. Add Book
2. View All Books
3. Update Book
4. Delete Book
5. Exit
Choose:

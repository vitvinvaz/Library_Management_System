# Library Management System

## Project Overview

This project is a **console-based Library Management System** built using **Java**. The system allows users to manage books in a library by providing features like adding, deleting, issuing, and returning books. It also handles basic student information and tracks which books have been issued.

---

## Table of Contents

1. [Technologies Used](#technologies-used)
2. [Features](#features)
3. [Classes Overview](#classes-overview)
4. [How to Run](#how-to-run)
5. [License](#license)

---

## Technologies Used

- **Java**: The core programming language used to implement the logic.
- **Collections**: Used `ArrayList` and `HashMap` to store and manage books and student information.
- **Scanner**: Used to capture user input from the console.

---

## Features

- **Add New Book**: Allows the user to add a new book to the system.
- **Display Books**: Displays all available books in the library.
- **Search Book**: Allows the user to search for a book by title.
- **Issue Book**: Enables a student to issue a book from the library.
- **Return Book**: Allows students to return books, making them available for other users.
- **Delete Book**: Deletes a book from the system using its ID.

---

## Classes Overview

### 1. `Library.java`
The main class that contains the main method. It handles the interaction with the user and provides the menu for managing books.

### 2. `Book.java`
This class represents a book in the library with attributes such as ID, title, author, category, and availability status.

### 3. `Student.java`
Represents a student in the system, holding their name and a list of books issued to them.

### 4. `ReturnBook.java`
This class handles the logic for returning books by students and adding them back to the library.

---

## How to Run

1. Clone this repository to your local machine.

    ```bash
    git clone <repository-url>
    ```

2. Navigate to the project directory.

    ```bash
    cd LibraryManagementSystem
    ```

3. Compile the Java files using your IDE or terminal.

4. Run the `Library.java` class to start the application.

    ```bash
    java Library
    ```

---

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

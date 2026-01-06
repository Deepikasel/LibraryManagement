package controller;

import model.Book;
import service.BookService;
import util.InputUtil;

public class LibraryController {

    private BookService service = new BookService();

    public void start() {
        while (true) {
            clearScreen();
            System.out.println("\n------ Library Management ------");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Update Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Exit");
            System.out.print("Choose: ");

            int choice = InputUtil.getInt();

            switch (choice) {
                case 1: addBook(); break;
                case 2: service.listBooks(); break;
                case 3: updateBook(); break;
                case 4: deleteBook(); break;
                case 5: return;
                default: System.out.println("Invalid choice!");
            }
        }
    }
    
private void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
}

    private void addBook() {
        System.out.print("Enter ID: ");
        int id = InputUtil.getInt();

        System.out.print("Enter Title: ");
        String title = InputUtil.getString();

        System.out.print("Enter Author: ");
        String author = InputUtil.getString();

        System.out.print("Enter Year: ");
        int year = InputUtil.getInt();

        service.addBook(new Book(id, title, author, year));
        System.out.println("Book added!");
    }

    private void updateBook() {
        System.out.print("Enter Book ID to Update: ");
        int id = InputUtil.getInt();

        System.out.print("New Title: ");
        String title = InputUtil.getString();

        System.out.print("New Author: ");
        String author = InputUtil.getString();

        System.out.print("New Year: ");
        int year = InputUtil.getInt();

        if (service.updateBook(id, title, author, year))
            System.out.println("Updated!");
        else
            System.out.println("Book not found!");
    }

    private void deleteBook() {
        System.out.print("Enter Book ID to Delete: ");
        int id = InputUtil.getInt();

        if (service.deleteBook(id))
            System.out.println("Deleted!");
        else
            System.out.println("Book not found!");
    }
}

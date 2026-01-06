package service;

import model.Book;
import repository.BookRepository;

import java.util.List;

public class BookService {

    private BookRepository repo = new BookRepository();

    // CREATE
    public boolean addBook(Book b) {
        return repo.add(b);
    }

    // READ BY ID
    public Book getBook(int id) {
        return repo.getById(id);
    }

    // UPDATE
    public boolean updateBook(int id, String title, String author, int year) {
        return repo.update(id, title, author, year);
    }

    // DELETE
    public boolean deleteBook(int id) {
        return repo.delete(id);
    }

    // READ ALL
    public void listBooks() {
        List<Book> books = repo.getAll();
        if (books.isEmpty()) {
            System.out.println("No books found.");
            return;
        }
        for (Book b : books) {
            System.out.println(b);
        }
    }
}

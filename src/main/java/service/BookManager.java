package service;

import model.Book;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BookManager {
    private List<Book> totalBooks = new LinkedList<Book>();

    public void addBook(Book book) {
        totalBooks.add(book);
    }

    public boolean removeBook(String title) {
        return totalBooks.removeIf(book -> book.getTitle().equals(title));
    }

    public String listBooks() {
        return totalBooks.toString();
    }
}

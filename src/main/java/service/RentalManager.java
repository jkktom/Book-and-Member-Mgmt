package service;

import model.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RentalManager {

    private Map<String, List<Book>> rentalStatus
            = new HashMap<String, List<Book>>();

    public void rentBook(String id, List<Book> books) {
        rentalStatus.put(id, books);
    }
    public void rentBook(String id, Book book) {
        if(rentalStatus.containsKey(id)) {
            rentalStatus.get(id).add(book);
            return;
        }
        List<Book> bookList = new ArrayList<>();
        bookList.add(book);
        rentalStatus.put(id, bookList);

    }

    public String getRentalList(String id) {
        StringBuilder sb = new StringBuilder();
        List<Book> books = rentalStatus.get(id);
        if (books == null) return "";
        
        sb.append("Member ID: ").append(id).append(" -> Rental Books: ");
        for (Book book : books) {
            sb.append(book.getTitle()).append("; ");
        }
        return sb.toString();
    }

}

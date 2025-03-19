package service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import model.Book;
import model.LibraryMember;

class RentalManagerTest {
    private RentalManager rentalManager;
    private LibraryMember member;
    private LibraryMember member2;
    private Book book1;
    private Book book2;
    private Book book3;

    @BeforeEach
    public void setUp() {
        rentalManager = new RentalManager();
        member = new LibraryMember("LM001", "John Doe");
        member2 = new LibraryMember("LM002", "Jake");
        book1 = new Book("Clean code", "Robert C. Martin", 45.0);
        book2 = new Book("Effective Java", "Joshua", 55.0);
        book3 = new Book("Klava", "Joshua", 55.0);
    }

    @AfterEach
    public void tearDown() {
        rentalManager = null;
    }

    @Test
    public void testRentBook() {
        rentalManager.rentBook(member.getId(), book1);
        String rentalList = rentalManager.getRentalList(member.getId());
//        System.out.println(" The list of rental list" + rentalList);
        assertTrue(rentalList.contains("Clean code"));
    }

    @Test
    public void testMultipleRentals() {
        rentalManager.rentBook(member.getId(), book1);
        rentalManager.rentBook(member.getId(), book2);
        String rentalList = rentalManager.getRentalList(member.getId());
        System.out.println(" The list of rental list : " + rentalList + "\n");
        rentalManager.rentBook(member2.getId(), book1);
        rentalManager.rentBook(member2.getId(), book2);
        rentalManager.rentBook(member2.getId(), book3);
        rentalList = rentalManager.getRentalList(member2.getId());
        System.out.println(" The list of rental list : " + rentalList + "\n");

    }

    @Test
    public void testNonExistentMember() {
        String rentalList = rentalManager.getRentalList("NonExistentID");
        assertTrue(rentalList.isEmpty());
    }
}
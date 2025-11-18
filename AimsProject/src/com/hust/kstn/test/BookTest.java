package com.hust.kstn.test;

import com.hust.kstn.models.Book;
import com.hust.kstn.models.BookAuthor;
import java.util.ArrayList;
import java.util.List;

public class BookTest {

    public static void main(String[] args) {
        BookAuthor author1 = new BookAuthor("Shinkai Makoto", 1973, "Japanese film director and novelist, known for 'Your Name'.");
        BookAuthor author2 = new BookAuthor("Kamoshida Hajime", 1978, "Japanese light novel author and screenwriter.");

        List<BookAuthor> authorsSM = new ArrayList<>();
        authorsSM.add(author1);

        List<BookAuthor> authorsKH = new ArrayList<>();
        authorsKH.add(author2);

        Book book1 = new Book("Your Name (Novel)", "Fantasy/Romance", 20.00, 80000, authorsSM);
        Book book2 = new Book("Just Because (Light Novel)", "Slice of Life/School", 15.00, 60000, authorsKH);
        System.out.println("Testing Book 1 (Shinkai Makoto):");
        System.out.println(book1.toString()); 
        System.out.println("\nTesting Book 2 (Kamoshida Hajime):");
        System.out.println(book2.toString());
    }
}
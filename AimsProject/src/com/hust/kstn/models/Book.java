package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private int numOfTokens; 
    private List<BookAuthor> authors = new ArrayList<>();

    public Book(String title, String category, double cost, int numOfTokens, List<BookAuthor> authors) {
        super(title, cost, category);
        this.numOfTokens = numOfTokens;
        this.authors = authors;
    }

    public int getNumOfTokens() { return numOfTokens; }
    public List<BookAuthor> getAuthors() { return authors; }

    @Override
    public String toString() {
        String authorList = "";
        for (BookAuthor author : authors) {
            authorList += author.toString(); 
        }

        return super.toString()
             + " [" + this.numOfTokens + " tokens]"
             + "\n  Authors: " + authorList;
    }
}
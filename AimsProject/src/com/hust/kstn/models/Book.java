package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private int numOfTokens; 
    private List<BookAuthor> authors = new ArrayList<>();
    private int id;
    private String title;
    private String category;
    private double cost;
    
    private static int nbBooks = 0; 

    public Book(String title, String category, double cost, int numOfTokens, List<BookAuthor> authors) {
        this.id = ++nbBooks;
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.numOfTokens = numOfTokens;
        this.authors = authors;
    }

    public int getNumOfTokens() { return numOfTokens; }
    public List<BookAuthor> getAuthors() { return authors; }
    public int getId() { return id; }
    public String getTitle() { return title; }
    public double getCost() { return cost; }
    public String getCategory() { return category; }

    @Override
    public String toString() {
        String authorList = "";
        for (BookAuthor author : authors) {
            authorList += author.toString(); 
        }

        return "Book [" + this.id + "]["
             + this.title + "] ["
             + this.cost + " $]["
             + this.category + "]["
             + this.numOfTokens + " tokens]"
             + "\nAuthors: " + authorList; 
    }
    
}
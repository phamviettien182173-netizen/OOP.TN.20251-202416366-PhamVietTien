package com.hust.kstn.models;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private double cost; 
    private static int nbDigitalVideoDiscs = 0;
    private int id;
    
    public DigitalVideoDisc(String title) {
        this.title = title;
        this.id = ++nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String category, String title, double cost) {
        this.category = category;
        this.title = title;
        this.cost = cost;
        this.id = ++nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String director, String category, String title, double cost) {
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
        this.id = ++nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        this.id = ++nbDigitalVideoDiscs;
    }

    @Override
    public String toString() {
     return "DVD" + "[" + this.id + "]"
     + "[" + this.title + "]"
     + "[" + this.cost + "]"
     + "[" + this.director + "]"
     + "[" + this.length + "]"
     + "[" + this.category + "]";
    }
    

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }
    public int getId() {
        return id;
    }

    public double getCost() {
        return cost;
    }
}
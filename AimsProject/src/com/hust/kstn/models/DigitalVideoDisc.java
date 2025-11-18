package com.hust.kstn.models;

public class DigitalVideoDisc extends Disc {
    
    public DigitalVideoDisc(String title) {
        super(title, "Unknown", 0.0, null, 0);
    }

    public DigitalVideoDisc(String category, String title, double cost) {
        super(title, category, cost, null, 0);
    }

    public DigitalVideoDisc(String director, String category, String title, double cost) {
        super(title, category, cost, director, 0);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
        super(title, category, cost, director, length);
    }

    @Override
    public String toString() {
     return "DVD" + super.toString();
    }
}
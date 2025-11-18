package com.hust.kstn.models;

public class Disc extends Media {
    private String director;
    private int length;

    public Disc(String title, String category, double cost, String director, int length) {
        super(title, cost, category);
        this.director = director;
        this.length = length;
    }

    public String getDirector() { return director; }
    public int getLength() { return length; }

    public void play() {
        if (this.length <= 0) {
            System.out.println("Disc '" + this.getTitle() + "' cannot be played (length <= 0).");
            return;
        }
        System.out.println("Playing Disc: " + this.getTitle() + ". Duration: " + this.length + " min.");
    }

    @Override
    public String toString() {
        return super.toString()
             + " [" + this.director + "]"
             + " [" + this.length + " min]";
    }
}
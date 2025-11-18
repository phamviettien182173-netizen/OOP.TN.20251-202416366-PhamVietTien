package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc {
    private String artist;
    private String director;
    private List<Track> tracks = new ArrayList<>(); 
    private int id;
    private String title;
    private String category;
    private double cost;
    private static int nbCDs = 0; 
    
    public CompactDisc(String title, String category, double cost, String artist, String director, List<Track> initialTracks) {
        this.id = ++nbCDs;
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.artist = artist;
        this.director = director;
        if (initialTracks != null) {
            this.tracks = initialTracks;
        }
    }

    public String getArtist() { return artist; }
    public String getDirector() { return director; }
    public List<Track> getTracks() { return tracks; }
    public String getTitle() { return title; }
    public double getCost() { return cost; }
    public int getId() { return id; }
    public String getCategory() { return category; }
    
    public int totalLength() {
        int total = 0;
        for (Track track : tracks) {
            total += track.getLength();
        }
        return total;
    }
    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("Error: Track '" + track.getTitle() + "' already exists in the CD.");
            return;
        }
        tracks.add(track);
        System.out.println("Added track: " + track.getTitle());
    }
    public void removeTrack(Track track) {
        if (tracks.remove(track)) {
            System.out.println("Removed track: " + track.getTitle());
        } else {
            System.out.println("Error: Track '" + track.getTitle() + "' not found in the CD.");
        }
    }
    public void play() { 
        int length = totalLength();
        if (length <= 0) {
            System.out.println("CD '" + this.title + "' cannot be played.");
            return;
        }

        System.out.println("=== Playing CD: " + this.title + " ===");
        System.out.println("Total duration: " + length + " min.");

        for (Track track : tracks) {
            track.play();
        }
        System.out.println("=== End of CD: " + this.title + " ===");
    }

    @Override
    public String toString() {
        return "CompactDisc [" + this.id + "]["
             + this.title + "] ["
             + this.cost + " $]["
             + this.category + "]"
             + "\n  Artist: " + this.artist
             + "\n  Director: " + this.director
             + "\n  Total Length: " + totalLength() + " min"
             + "\n  Tracks: " + this.tracks;
    }
}
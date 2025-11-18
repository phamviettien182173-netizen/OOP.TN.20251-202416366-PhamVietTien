package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc {
    private String artist;
    private List<Track> tracks = new ArrayList<>(); 
    
    public CompactDisc(String title, String category, double cost, String artist, String director, List<Track> initialTracks) {
        super(title, category, cost, director, 0); 
        this.artist = artist;
        if (initialTracks != null) {
            this.tracks = initialTracks;
        }
    }

    public String getArtist() { return artist; }
    public List<Track> getTracks() { return tracks; }
    
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

    @Override
    public void play() {
        int length = totalLength();
        if (length <= 0) {
            System.out.println("CD '" + this.getTitle() + "' cannot be played.");
            return;
        }

        System.out.println("=== Playing CD: " + this.getTitle() + " ===");
        System.out.println("Total duration: " + length + " min.");

        for (Track track : tracks) {
            track.play();
        }
        System.out.println("=== End of CD: " + this.getTitle() + " ===");
    }

    @Override
    public String toString() {
        return "CompactDisc " + super.toString() 
             + "\n  Artist: " + this.artist
             + "\n  Calculated Total Length: " + totalLength() + " min"
             + "\n  Tracks: " + this.tracks;
    }
}
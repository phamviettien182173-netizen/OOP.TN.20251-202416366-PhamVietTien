package com.hust.kstn.test;

import com.hust.kstn.models.CompactDisc;
import com.hust.kstn.models.Track;
import java.util.ArrayList;
import java.util.List;

public class CompactDiscTest {

    public static void main(String[] args) {
        Track track1 = new Track("Track A: Happy Day", 5);
        Track track2 = new Track("Track B: Sad Evening", 8);
        Track track3 = new Track("Track C: Zero Length", 0); 
        
        List<Track> initialTracks = new ArrayList<>();
        initialTracks.add(track1);
        initialTracks.add(track2);
        CompactDisc cd1 = new CompactDisc("Best of Pop", "Pop", 35.99, "Various Artists", "John Doe", initialTracks);
        System.out.println("1. Testing CD Details and totalLength():");
        System.out.println(cd1.toString()); 
        System.out.println("Calculated Total Length: " + cd1.totalLength());

        System.out.println("\n2. Testing addTrack and removeTrack:");
        cd1.addTrack(track3);
        cd1.removeTrack(track1); 
        System.out.println("CD Status after modifications:");
        System.out.println(cd1.toString());

        System.out.println("\n3. Testing play() method:");
        cd1.play();

        System.out.println("\n4. Testing Empty CD Play:");
        CompactDisc cd2 = new CompactDisc("Empty Album", "Ambient", 10.00, "None", "Unknown", null);
        cd2.play();
    }
}
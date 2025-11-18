package com.hust.kstn.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {

    public static void main(String[] args) {
        String filename = "C:\\\\VIETTIENF\\\\OOP Projects\\\\OOP.TN.20251-202416366-PhamVietTien\\\\OtherProject\\\\src\\\\com\\\\hust\\\\kstn\\\\garbage\\test.txt";
        byte[] inputBytes = {};
        long startTime, endTime;
        String outputString = "";

        try {
            inputBytes = Files.readAllBytes(Paths.get(filename)); 
            
            startTime = System.currentTimeMillis();
            
            for (byte b : inputBytes) { 
                outputString += (char)b;
            }
            
            endTime = System.currentTimeMillis();
            
            System.out.println((endTime - startTime) + " ms"); 

        } catch (IOException e) {
            System.err.println("Error reading file: " + filename);
            e.printStackTrace();
        }
    }
}
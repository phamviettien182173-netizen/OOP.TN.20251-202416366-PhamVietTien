package com.hust.kstn.test;

import com.hust.kstn.models.DigitalVideoDisc;
import com.hust.kstn.models.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store aimsStore = new Store();
        DigitalVideoDisc dvdA = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99);
        DigitalVideoDisc dvdB = new DigitalVideoDisc("The Lord of the Rings", "Fantasy", "Peter Jackson", 178, 29.99);
        DigitalVideoDisc dvdC = new DigitalVideoDisc("Inception", "Sci-Fi", "C. Nolan", 148, 25.50);
        DigitalVideoDisc dvdD = new DigitalVideoDisc("Non-existent DVD"); 

        System.out.println("1. Testing Initial Store Status:");
        aimsStore.printStoreItems(); 

        System.out.println("\n2. Testing Adding DVDs:");
        aimsStore.addDVD(dvdA);
        aimsStore.addDVD(dvdB);
        aimsStore.printStoreItems();

        
        System.out.println("\n3. Testing Removing Existing DVD (Aladdin):");
        aimsStore.removeDVD(dvdA);
        aimsStore.printStoreItems();

        
        System.out.println("\n4. Testing Removing Non-existent DVD (Non-existent DVD):");
        aimsStore.removeDVD(dvdD);
        aimsStore.printStoreItems();
        
        System.out.println("\n5. Testing Store Full Capacity:");
        aimsStore.addDVD(dvdC);
        for (int i = 0; i < 98; i++) { 
            aimsStore.addDVD(new DigitalVideoDisc("DVD #" + (i + 1)));
        }
        
        System.out.println("\nStore status: 100 items added.");
        aimsStore.printStoreItems(); 

        System.out.println("\n6. Add 101st item:");
        DigitalVideoDisc dvd101 = new DigitalVideoDisc("Over Capacity DVD");
        aimsStore.addDVD(dvd101); 
    }
}
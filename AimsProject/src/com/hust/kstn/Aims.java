package com.hust.kstn;

import com.hust.kstn.models.Cart;
import com.hust.kstn.models.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Your Name", "Romance/Fantasy","Makoto Shinkai", 107, 29.99);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("One Punch Man", "Action/Sci-Fi","Shingo Natsume", 120, 35.50);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Kids/Comedy", "Doraemon", 15.00); 
            DigitalVideoDisc dvd4 = new DigitalVideoDisc("Armor Hero");

        cart.addDVD(dvd1); 
        cart.addDVD(dvd2); 
        cart.addDVD(dvd3);
        
        cart.print();
        
        String removedTitle = dvd2.getTitle();
        cart.removeDVD(dvd2); 
        
        System.out.println("\n--- Cart after removing " + removedTitle + " ---");
        cart.print();
        
        System.out.println("\n--- Testing edge cases ---");
        cart.removeDVD(dvd4); 
        
        cart.addDVD(dvd4);
        cart.addDVD(new DigitalVideoDisc("Test Full"));
    }
}
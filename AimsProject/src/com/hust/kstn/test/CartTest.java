package com.hust.kstn.test;

import com.hust.kstn.models.Cart;
import com.hust.kstn.models.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Titanic");
        
        System.out.println("1. Testing Initial Cart:");
        cart.print(); 
        
        System.out.println("\\n2. Testing Removing DVD from empty cart:");
        cart.removeDVD(dvd1);

        
        System.out.println("\n3. Testing Adding DVDs:");
        cart.addDVD(dvd1);
        cart.addDVD(dvd2);
        cart.print();

        System.out.println("\n4. Testing Removing Existing DVD (Star Wars):");
        cart.removeDVD(dvd2);
        cart.print();
        
        System.out.println("\n5. Testing Removing Non-existent DVD (Titanic):");
        cart.removeDVD(dvd4);
        cart.print();

        System.out.println("\n6. Testing Cart Full Capacity:");

        cart.addDVD(dvd3);
        for (int i = 0; i < 18; i++) {
            cart.addDVD(new DigitalVideoDisc("DVD #" + (i + 4)));
        }
        
        System.out.println("\nCart status: 20 items added.");
        cart.print(); 

        System.out.println("\nAdd 21st item :");
        DigitalVideoDisc dvd21 = new DigitalVideoDisc("21st DVD");
        cart.addDVD(dvd21);
    }
}
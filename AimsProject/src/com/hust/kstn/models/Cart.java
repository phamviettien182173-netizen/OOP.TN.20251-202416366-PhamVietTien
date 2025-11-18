package com.hust.kstn.models;
public class Cart {
    private static final int MAX_NUMBER_ORDERED = 20; 
    private DigitalVideoDisc[] itemsInCart = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    private int qtyOrdered = 0;

    public void addDVD(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBER_ORDERED) {
            itemsInCart[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added sucessfully");
        } else {
            System.out.println("The cart is full. Cannot add more DVD.");
        }
    }
    public void addDVD(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
    	if (qtyOrdered + 1 < MAX_NUMBER_ORDERED) {
            itemsInCart[qtyOrdered] = disc1;
            qtyOrdered++;
            itemsInCart[qtyOrdered] = disc2;
            qtyOrdered++;
            System.out.println("The discs has been added sucessfully.");
        } else {
        		 System.out.println("The cart is almost full. Cannot add more DVD.");
        }
    }
    public void addDVD(DigitalVideoDisc[] discs) {
        for (DigitalVideoDisc disc : discs) {
            if (qtyOrdered < MAX_NUMBER_ORDERED) {
                itemsInCart[qtyOrdered++] = disc;
            } else {
                System.out.println("The cart is full.");
                break;
            }
        }
    }

    public void removeDVD(DigitalVideoDisc disc) {
        if (qtyOrdered == 0) {
            System.out.println("The cart is empty. Cannot remove DVD.");
            return;
        }

        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsInCart[i] == disc) { 
                found = true;
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsInCart[j] = itemsInCart[j + 1];
                }
                itemsInCart[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("The disc has been removed sucessfully");
                break;
            }
        }

        if (!found) {
            System.out.println("The disc does not exist in the cart.");
        }
    }

    public double calculateTotalCost() {
        double totalCost = 0.0;
        for (int i = 0; i < qtyOrdered; i++) { 
            totalCost += itemsInCart[i].getCost();
        }
        return totalCost;
    }

    public void print() {
        System.out.println("== THE CURRENT CART ===="); 
        if (qtyOrdered == 0) {
            System.out.println("The cart is empty.");
            System.out.println("========================");
            return;
        }
        
        System.out.println("Total items: " + qtyOrdered);
        
        double subtotal = 0.0;
        
        for (int i = 0; i < qtyOrdered; i++) {
            DigitalVideoDisc item = itemsInCart[i];
            System.out.println(item.toString()); 
            
            subtotal += item.getCost();
        }
        
        System.out.println("Subtotal: " + subtotal + " $"); // 
        System.out.println("========================");
    }
}
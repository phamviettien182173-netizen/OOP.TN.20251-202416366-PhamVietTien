package com.hust.kstn.models;

public class Store {
    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[100]; 
    private int qtyInStore = 0;

    public void addDVD(DigitalVideoDisc disc) {
        if (qtyInStore < itemsInStore.length) {
            itemsInStore[qtyInStore] = disc;
            qtyInStore++;
            System.out.println("Added '" + disc.getTitle() + "' to the store.");
        } else {
            System.out.println("The store is full. Cannot add more items.");
        }
    }

    public void removeDVD(DigitalVideoDisc disc) {
        if (qtyInStore == 0) {
            System.out.println("The store is currently empty. Cannot remove item.");
            return;
        }

        int removedIndex = -1;
        
        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore[i] != null && itemsInStore[i].getId() == disc.getId()) {
                removedIndex = i;
                break;
            }
        }

        if (removedIndex != -1) {
            System.out.println("Removed '" + disc.getTitle() + "' from the store.");
            for (int i = removedIndex; i < qtyInStore - 1; i++) {
                itemsInStore[i] = itemsInStore[i + 1];
            }
            
            itemsInStore[qtyInStore - 1] = null;
            qtyInStore--;
        } else {
            System.out.println("Item '" + disc.getTitle() + "' not found in the store.");
        }
    }
    
    public void printStoreItems() {
        System.out.println("=== AIMS STORE ITEMS (Total: " + qtyInStore + ") ===");
        if (qtyInStore == 0) {
            System.out.println("The store is empty.");
            return;
        }
        
        for (int i = 0; i < qtyInStore; i++) {
            System.out.println((i + 1) + ". " + itemsInStore[i].toString()); 
        }
        System.out.println("=============================================");
    }
}
package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomListApplication {

	public static void main(String[] args) {
        CustomList<String> list = new CustomArrayList<>();
        
        // Test add method
        System.out.println("");
        System.out.println("This is the add test; ");
        System.out.println("");
        
        for (int i = 0; i < 15; i++) {
            boolean result = list.add("Item " + i);
            
            System.out.println("Added: Item " + i + ", add: " + result);
        }
        // Test get method	
        System.out.println("");
        System.out.println("This is the get test; ");
        System.out.println("");
        
        for (int i = 0; i < list.getSize(); i++) {
        	
        	System.out.println(list.get(i));
        	
        }

        // Test getSize method
        System.out.println("");
        System.out.println("This is the getSize test; ");
        System.out.println("");
        
        System.out.println("\nSize of the list: " + list.getSize());
    }

}

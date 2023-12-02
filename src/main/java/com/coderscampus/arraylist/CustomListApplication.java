package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomListApplication {

    public static void main(String[] args) {
        CustomList<String> list = new CustomArrayList<>();

        testAddMethod(list);
        testGetMethod(list);
        testGetSizeMethod(list);
    }

    private static void testAddMethod(CustomList<String> list) {
        System.out.println("Testing add method:");
        System.out.println("Adding null: " + list.add(null));
        for (int i = 0; i < 20; i++) {
            boolean result = list.add("Item " + i);
            System.out.println("Added: Item " + i + ", add: " + result);
        }
        System.out.println();
    }

    private static void testGetMethod(CustomList<String> list) {
        System.out.println("Testing get method:");
        System.out.println("Element at index 7: " + list.get(7));
        System.out.println();
    }

    private static void testGetSizeMethod(CustomList<String> list) {
        System.out.println("Testing getSize method:");
        System.out.println("Size of the list expected 20: " + list.getSize());
        System.out.println();
    }
}
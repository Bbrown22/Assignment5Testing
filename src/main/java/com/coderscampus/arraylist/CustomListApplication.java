package com.coderscampus.arraylist;

//import java.util.Arrays;

public class CustomListApplication {

	public static void main(String[] args) {
		CustomArrayList<String> list = new CustomArrayList<>();

		testAddMethod(list);
		testGetMethod(list);
		testGetSizeMethod(list);
		testGetCapacityMethod(list);
	}

	private static void testAddMethod(CustomArrayList<String> list) {
		System.out.println("Testing add method:");
		System.out.println("Adding null: " + list.add(null));
		for (int i = 0; i < 25; i++) {
			boolean result = list.add("Item " + i);
			System.out.println("Added: Item " + i + ", add: " + result);
		}
		System.out.println();
	}

	private static void testGetMethod(CustomArrayList<String> list) {
		System.out.println("Testing get method:");
		System.out.println("Element at index 7: " + list.get(7));
		System.out.println();
	}

	private static void testGetSizeMethod(CustomArrayList<String> list) {
		System.out.println("Testing getSize method:");
		System.out.println("Size of the list expected 25: " + list.getSize());
		System.out.println();
	}

	private static void testGetCapacityMethod(CustomArrayList<String> list) {
		System.out.println("Testing getCapacity method:");
		System.out.println("Capacity of the list expected 40: " + list.getCapacity());
		System.out.println();
	}
}
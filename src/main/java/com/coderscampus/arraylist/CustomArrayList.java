package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];

	@Override
	public boolean add(T item) {
		if (item == null) {
			return false;
		}
		Object[] newItems = new Object[items.length + 1];
		System.arraycopy(items, 0, newItems, 0, items.length);
		newItems[items.length] = item;
		items = newItems;
		return true;
	}

	@Override
	public int getSize() {
		int currentSize = 0;
		
		for(int i = 0; i < items.length; i++) {
			if(items[i] != null) {
				currentSize++;
			}
		}
		return currentSize;
		
	}

	@Override
	public T get(int index) {
		if (index < 0 || index >= items.length) {
			throw new IndexOutOfBoundsException();
		}
		return (T) items[index];
	}

	@Override
	public String toString() {
		return "CustomArrayList [items=" + Arrays.toString(items) + "]";
	}
	
}

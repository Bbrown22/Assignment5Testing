package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	private int size = 0;

	@Override
    public boolean add(T item) {
        if (item == null) {
            return false;
        }
        if (size == items.length) {
            Object[] newItems = new Object[items.length * 2];
            System.arraycopy(items, 0, newItems, 0, items.length);
            items = newItems;
        }
        items[size] = item;
        size++;
        return true;
    }
	public int getCapacity() {
	    return items.length;
	}
	 @Override
	    public int getSize() {
	        return size;
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

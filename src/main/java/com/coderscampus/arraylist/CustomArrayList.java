package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
    private Object[] items = new Object[10];
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

    public void add(int index, T item) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (size == items.length) {
            Object[] newItems = new Object[items.length * 2];
            System.arraycopy(items, 0, newItems, 0, items.length);
            items = newItems;
        }
        System.arraycopy(items, index, items, index + 1, size - index);
        items[index] = item;
        size++;
    }

    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        T removedItem = (T) items[index];
        System.arraycopy(items, index + 1, items, index, size - index - 1);
        size--;
        items[size] = null;
        return removedItem;
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
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (T) items[index];
    }

    @Override
    public String toString() {
        Object[] actualItems = Arrays.copyOf(items, size);
        return "CustomArrayList [items=" + Arrays.toString(actualItems) + "]";
    }
}
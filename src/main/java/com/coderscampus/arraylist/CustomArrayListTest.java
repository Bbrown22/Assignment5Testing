package com.coderscampus.arraylist;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CustomArrayListTest {
	private CustomArrayList<Integer> list;

	@Before
	public void setUp() {
		list = new CustomArrayList<>();
	}

	@Test
	public void testAdd() {
		assertTrue(list.add(1));
		assertEquals(1, list.getSize());
		assertEquals(Integer.valueOf(1), list.get(0));
	}

	@Test
	public void testAddAtIndex() {
		list.add(0, 1);
		assertEquals(1, list.getSize());
		assertEquals(Integer.valueOf(1), list.get(0));
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testAddAtIndexOutOfBounds() {
		list.add(1, 1);
	}

	@Test
	public void testGetSize() {
		list.add(1);
		list.add(2);
		assertEquals(2, list.getSize());
	}

	@Test
	public void testGet() {
		list.add(1);
		assertEquals(Integer.valueOf(1), list.get(0));
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetOutOfBounds() {
		list.get(0);
	}

	@Test
	public void testRemove() {
		list.add(1);
		assertEquals(Integer.valueOf(1), list.remove(0));
		assertEquals(0, list.getSize());
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testRemoveOutOfBounds() {
		list.remove(0);
	}

	@Test
	public void testAddNull() {
		assertFalse(list.add(null));
		assertEquals(0, list.getSize());
	}

	@Test
	public void testAddIncreaseCapacity() {
		for (int i = 0; i < 11; i++) {
			list.add(i);
		}
		assertEquals(11, list.getSize());
		assertEquals(20, list.getCapacity());
	}

	@Test
	public void testToString() {
		list.add(1);
		list.add(2);
		list.add(3);
		assertEquals("CustomArrayList [items=[1, 2, 3]]", list.toString());
	}
}
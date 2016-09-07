package seedu.addressbook.common;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.*;

public class UtilsTest {
	
	private Utils utils = new Utils();
	
	@Test public void isNullTest() {
		Object object = null;
		Boolean value = utils.isAnyNull(object);
		assertTrue(value.equals(true));
	}
	
	@Test public void isNotNullTest() {
		Object object = new Object();
		Boolean value = utils.isAnyNull(object);
		assertFalse(value.equals(true));
	}
	
	@Test public void isUniqueTest() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("John");
		list.add("Mary");
		assertTrue(utils.elementsAreUnique(list));
	
	}
	
	@Test public void isNotUniqueTest() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("John");
		list.add("John");
		assertFalse(utils.elementsAreUnique(list));
	
	}
	

}

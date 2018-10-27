package com.unittesting.junit4;

import java.util.ArrayList;

import org.junit.Test;

public class TCException {

	@Test(expected = IndexOutOfBoundsException.class) 
	public void empty() { 
	     new ArrayList<Object>().get(0); 
	}
	@Test(expected = NullPointerException.class) 
	public void nullPointer() { 
	     new ArrayList<Object>().get(0); 
	}
	
}

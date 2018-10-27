package com.unittesting.junit4;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;




public class TCIgnore {

	
	//Note that @Ignore takes an optional parameter (a String) if you want to record a reason why a test is being ignored.
	@Ignore("Test is ignored as a demonstration")
	@Test
	public void testSame() {
	    //assertThat(1, is(1));
		assertEquals(1,1);
		
	}

	
	
}

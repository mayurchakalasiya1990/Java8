package com.unittesting.junit4;

import org.junit.Test;

public class TCTimeout {

	// You can optionally specify timeout in milliseconds to cause a test method to
	// fail if it takes longer than that number of milliseconds. If the time limit
	// is exceeded, then the failure is triggered by an Exception being thrown

	// This is implemented by running the test method in a separate thread. If the
	// test runs longer than the allotted timeout, the test will fail and JUnit will
	// interrupt the thread running the test. If a test times out while executing an
	// interruptible operation, the thread running the test will exit (if the test
	// is in an infinite loop, the thread running the test will run forever, while
	// other tests continue to execute).
	
	@Test(timeout = 1000)
	public void testWithTimeout() {
		System.out.println("Junit Running");
	}

}

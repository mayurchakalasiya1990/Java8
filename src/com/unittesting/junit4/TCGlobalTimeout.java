package com.unittesting.junit4;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;


/**The timeout specified in the Timeout rule applies to the entire test fixture,including any @Before or @After
methods.If the test method is in an infinite loop(or is otherwise not responsive to interrupts)then @After
methods will not be called */
public class TCGlobalTimeout {

	public static String log;
	private final CountDownLatch latch = new CountDownLatch(1);

	@Rule
	public Timeout globalTimeout = new Timeout(1000); // 10 seconds max per method tested

	@Test
	public void testSleepForTooLong() throws Exception {
		log += "ran1";
		TimeUnit.MILLISECONDS.sleep(100); // sleep for 100 MILLISECONDSx
	}

	@Test
	public void testBlockForever() throws Exception {
		log += "ran2";
		latch.await(); // will block
	}

}

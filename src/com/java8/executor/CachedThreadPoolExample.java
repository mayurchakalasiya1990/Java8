package com.java8.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolExample {

	public static void main(String[] args) {

		// for lots of short lived Tasks.
		ExecutorService service = Executors.newCachedThreadPool();

		// Submit task for execution
		for (int i = 0; i < 100; i++) {
			service.equals(new Task());
		}
	}

	static class Task implements Runnable {

		@Override
		public void run() {
			// short Lived Task

		}

	}

}

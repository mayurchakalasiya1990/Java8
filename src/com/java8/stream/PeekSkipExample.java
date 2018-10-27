package com.java8.stream;

import java.util.stream.Stream;

public class PeekSkipExample {

	public static void main(String[] args) {
		System.out.println("-------SKIP-------");
		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0).skip(6).filter(n -> n > 5).forEachOrdered(n -> System.out.println(n));
		System.out.println("-------PEEK-------");
		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0).filter(n -> n > 5).peek(n-> System.out.println("Peek:"+n)).forEach(n -> System.out.println(n));

	}

}

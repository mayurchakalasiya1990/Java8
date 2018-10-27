package org.java8.stream;

import java.util.Arrays;
import java.util.List;

public class FilterExample {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Mayur", "Jeetu", "Nilesh", "Bhavesh");

		names.stream().filter(name -> !name.equalsIgnoreCase("Mayur")).forEach(name -> System.out.println(name));
		System.out.println("------------------------");
		names.stream().filter(name -> !name.equalsIgnoreCase("Jeetu")).forEach(System.out::println);

	}

}

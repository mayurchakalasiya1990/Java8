package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapperExample {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Mayur", "Jeetu", "Nilesh", "Bhavesh");

		names.stream().filter(name -> !name.equals("Mayur")).map(name -> new User(name, 27))
				.forEach(name -> System.out.println(name));

		List<User> userNames = names.stream().filter(name -> !name.equals("Mayur")).map(name -> new User(name, 27))
				.collect(Collectors.toList());
	}
}

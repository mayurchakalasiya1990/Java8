package com.java8.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamWithFilesExample {

	public static void main(String[] args) throws IOException {
		Stream<String> lines = Files.lines(Paths
				.get("C:\\Users\\jeetu\\workspace\\java\\java8 learning\\Java8\\src\\org\\java8\\stream\\pom.xml"));

		List<String> selectedLine = lines.filter(line -> line.contains("name")).map(line -> {
			return line.trim().replaceAll("name", "").replaceAll("<", "").replaceAll(">", "").replaceAll("/", "");
		}).collect(Collectors.toList());
		
		System.out.println("Selected Line: "+selectedLine);
	}

}

package com.capgemini.files.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {
	File file = new File(
			"C:\\Lahari\\Workspace\\Core Java\\Day2 Assignments\\src\\Complex.java");
	public boolean checkFileExists() {
		if (file.exists())
			return true;
		return false;
	}
	public int checkWordCount() throws IOException {
		FileReader reader = new FileReader(file);
		BufferedReader breader = new BufferedReader(reader);
		int count = 0;
		String content;
		while ((content = breader.readLine()) != null) {
			String s[] = content.split(" ");

			count = count + s.length;
		}
		System.out.println(count);
		breader.close();
		reader.close();
		return count;
	}

}

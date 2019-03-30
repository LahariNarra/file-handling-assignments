package com.capgemini.files.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LineCount {
	File file = new File(
			"C:\\Lahari\\Workspace\\Core Java\\Exeception\\exeception-assignments\\src\\com\\capgemini\\studentexception\\main\\Student.java");
	public boolean checkFileExists() {
		if (file.exists())
			return true;
		return false;
	}
	public int checkLineCount() throws IOException {
		FileReader reader = new FileReader(file);
		BufferedReader breader = new BufferedReader(reader);
		int count = 0;
		while (breader.readLine() != null) {
			count++;
		}

		breader.close();
		reader.close();
		return count;
	}

}

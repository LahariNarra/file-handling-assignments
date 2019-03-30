package com.capgemini.files.model;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

public class GrepApplication {
	File file = new File("C:\\Lahari\\Workspace\\Core Java\\Day2 Assignments\\src\\Distance.java");

	public boolean checkFileExists() {
		if (file.exists())
			return true;
		return false;
	}

	public List<String> checkWordPresent(String word) throws IOException {
		FileReader reader = new FileReader(file);
		LineNumberReader lineNumberReader = new LineNumberReader(reader);
		String line;
		List<String> list=new ArrayList<String>();
		while ((line = lineNumberReader.readLine()) != null) {
			for (String element : line.split(" ")) {
				if (element.equalsIgnoreCase(word)) {
					list.add("Word found at line " + lineNumberReader.getLineNumber());
				}
			}
		}
		return list ;
	}

}

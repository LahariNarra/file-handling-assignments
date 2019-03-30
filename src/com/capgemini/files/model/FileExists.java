package com.capgemini.files.model;

import java.io.File;

public class FileExists {
	public boolean checkFileExists() {
		File file = new File("C:\\Lahari\\Java_Assignments\\Head_First_Java_2nd_Edition.pdf");
		if (file.exists())
			return true;
		return false;
	}
	public boolean checkFileNotExists() {
		File file = new File("C:\\Lahari\\Java_Assignments\\Head_First_Java_2nd_Edition.ppt");
		if (file.exists())
			return true;
		return false;
	}

}

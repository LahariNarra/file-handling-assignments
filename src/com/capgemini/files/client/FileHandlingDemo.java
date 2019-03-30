package com.capgemini.files.client;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileHandlingDemo {
	public static void main(String[] args) throws IOException {

		/*
		 * File file = new
		 * File("C:\\Lahari\\Java_Assignments\\Head_First_Java_2nd_Edition.pdf");
		 * System.out.println(file.exists()); File folder = new
		 * File("C:\\Lahari\\Java_Assignments"); System.out.println(folder.exists());
		 */

		/*
		 * File file = new File("test.txt"); if (!file.exists()) { file.createNewFile();
		 * System.out.println("File is created successfully"); }
		 * 
		 * // FileWriter writer = new FileWriter(file); // BufferedWriter writer = new
		 * BufferedWriter(new FileWriter(file)); PrintWriter writer = new
		 * PrintWriter(new FileWriter(file,true)); writer.println("Hello...");
		 * writer.println("How are you??"); writer.println("I hope your are fine..");
		 * writer.println("Bye!!");
		 * 
		 * writer.close(); System.out.println("Content has been written successfully");
		 */

		/*
		 * FileReader reader = new FileReader(
		 * "C:\\Lahari\\Workspace\\Core Java\\Day2 Assignments\\src\\EmployeeSalaryDetails.java"
		 * ); BufferedReader bReader = new BufferedReader(reader);
		 * 
		 * PrintWriter writer = new PrintWriter("EmployeeSalaryDetails.java"); String
		 * content; while ((content = bReader.readLine()) != null) {
		 * writer.println(content); } System.out.println("--Success--"); writer.close();
		 * bReader.close(); reader.close();
		 */

		/*
		 * File windowsDirectory = new File("c:\\windows");
		 * System.out.println(windowsDirectory.isDirectory()); String content[] =
		 * windowsDirectory.list();
		 * 
		 * for(String s : content) { System.out.println(s); }
		 */

		File newDirectory = new File("myDirectory");
		if (!newDirectory.exists()) {
			newDirectory.mkdir();
			System.out.println("Folder is succesfully created..");
		}

		File file = new File(newDirectory, "myfile.txt");
		if (!file.exists()) {
			file.createNewFile();
			System.out.println("File is successfully created");
		}

	}

}

package com.capgemini.files.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.capgemini.files.model.FileExists;

class FileExistsTest {

	@Test
	public void testtoCheckFileExists() {
		FileExists fileExists = new FileExists();
		assertEquals(true, fileExists.checkFileExists());

	}
	
	@Test
	public void testtoCheckFileNotExists() {
		FileExists fileNotExists = new FileExists();
		assertEquals(true, fileNotExists.checkFileExists());

	}

	

}

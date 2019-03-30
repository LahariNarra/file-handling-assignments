package com.capgemini.files.tests;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.files.model.FileExists;
import com.capgemini.files.model.LineCount;

class LineCountTests {

	@Test
	public void testtoCheckFileExists() {
		FileExists fileExists = new FileExists();
		assertEquals(true, fileExists.checkFileExists());

	}
	@Test
	public void testToCheckFileIsNotNull() throws IOException {
		LineCount file = new LineCount();
		assertNotEquals(0, file.checkLineCount());
		
	}

	@Test
	public void testToCheckNumberOfLineInFile() throws IOException {
		LineCount lineCount = new LineCount();
		assertEquals(44, lineCount.checkLineCount());
	}

}

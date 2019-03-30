package com.capgemini.files.tests;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.files.model.FileExists;
import com.capgemini.files.model.WordCount;

class WordCountTest {
	
	@Test
	public void testtoCheckFileExists() {
		FileExists fileExists = new FileExists();
		assertEquals(true, fileExists.checkFileExists());

	}
	@Test
	public void testToCheckFileIsNotNull() throws IOException {
		WordCount file = new WordCount();
		assertNotEquals(0, file.checkWordCount());
		
	}

	@Test
	public void testToCheckNoOfWordsInFile() throws IOException {
		WordCount wordCount = new WordCount();
		assertEquals(82, wordCount.checkWordCount());
	}

}
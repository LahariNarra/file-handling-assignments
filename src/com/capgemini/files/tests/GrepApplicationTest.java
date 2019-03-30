package com.capgemini.files.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.capgemini.files.model.GrepApplication;

class GrepApplicationTest {

	@Test
	public void testtoCheckFileExists() {
		GrepApplication fileExists = new GrepApplication();
		assertEquals(true, fileExists.checkFileExists());

	}
	
	@Test
	public void testCheckWordPresent() throws IOException {
		GrepApplication greap = new GrepApplication();
		List<String> expectedList=new ArrayList<String>();
		expectedList.add("Word found at line 4");
		
		
		
		assertEquals(expectedList,greap.checkWordPresent("int"));
		
	
	}


}

package com.capgemini.files.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.capgemini.files.model.MyClass;

class MyClassTest {

	ArrayList<MyClass> customer;
	MyClass class1;
	@Before
	public void setUp()
	{
	    class1 =new MyClass(1, "lahari", 22);
		MyClass c2 =new MyClass(2, "mukhesh", 21);
		MyClass c3 =new MyClass(3, "karthik", 23);
		MyClass c4 =new MyClass(4, "divya", 21);
		MyClass c5 =new MyClass(5, "krishna", 22);
		
		customer = new ArrayList<MyClass>();
		customer.add(class1);
		customer.add(c2);
		customer.add(c3);
		customer.add(c4);
		customer.add(c5);
	}
	@Test
	public void testForSerialization() throws IOException 
	{
		MyClass m = new MyClass();
		assertTrue(m.serialization("Myclass.ser", customer));
		
	}
	
	@Test
	public void testForDeSerialization() throws IOException, ClassNotFoundException 
	{
		MyClass m = new MyClass();
		ArrayList<MyClass> arr=(ArrayList<MyClass>) m.deSerialization("myclass.ser");
		Iterator iterator=arr.iterator();
		assertEquals(class1, iterator.next());
		
	}
}

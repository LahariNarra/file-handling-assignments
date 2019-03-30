package com.capgemini.files.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.files.model.Employee;
import com.capgemini.files.model.EmployeeDeserializable;
import com.capgemini.files.model.EmployeeSerializable;

class EmployeeTest {

	private Employee employee;
	private EmployeeSerializable employeeSerialization;
	private EmployeeDeserializable employeeDeserialization;

	@Test
	public void testEmployeeSerialization() throws IOException {
		employee = new Employee(101, "John Doe", 45000);
		employeeSerialization = new EmployeeSerializable();
		assertTrue(employeeSerialization.writeObjectInFile("employee.ser", employee));
	}

	@Test
	public void testEmployeeDeSerialization() throws IOException, ClassNotFoundException {
		employee = new Employee(101, "John Doe", 45000);
		employeeDeserialization = new EmployeeDeserializable();
		assertEquals(employee, employeeDeserialization.deSerialize("employee.ser"));
	}
}

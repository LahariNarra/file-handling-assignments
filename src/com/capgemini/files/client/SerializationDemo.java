package com.capgemini.files.client;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.capgemini.files.model.BankAccount;
import com.capgemini.files.model.DebitCard;

public class SerializationDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		DebitCard debitCard = new DebitCard(12348333016931L, 774, 11, 21);
		BankAccount account = new BankAccount(101, "Lahari", "Saving", 24000, debitCard);

		// Serialization Process

		FileOutputStream fileOutputStream = new FileOutputStream("account.ser");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

		objectOutputStream.writeObject(account);
		objectOutputStream.close();

		FileInputStream fileInputStream = new FileInputStream("account.ser");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		
		BankAccount account2 = (BankAccount) objectInputStream.readObject();
		objectInputStream.close();
		System.out.println(account2);

	}
}

package org.tnsif.objects;
//program to demonstrate on DI in the form of objects
public class Student {
	Address address;

	public Student(Address address) {
		super();
		this.address = address;
	}

	public void print() {
		address.display();
	}
}

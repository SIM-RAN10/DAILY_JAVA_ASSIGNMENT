package com.assignment.privateaccess;

public class PrivateClass {
	public void privateMethod() {
		System.out.println("Inside privateMethod() of privateClass");
	}
	public void tryAccessPrivateMethod() {
		privateMethod();
	}

}

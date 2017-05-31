package com.sergio.singleton;

public enum SingletonEnum {
	INSTANCE;

	private String message = "";

	SingletonEnum() {
		message = "Hi there!";
	}

	public void sayHelloWorld() {
		System.out.println(message);
	}

	public void sayByeWorld() {
		message = "See you later, alligator";
		System.out.println(message);
	}

	public String getMessage() {
		return message;
	}

}

package com.sergio.singleton;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SingletonEnumTest {

	@Test
	public void testSingletonEnum() {
		String message = "See you later, alligator";
		SingletonEnum mySingleton = SingletonEnum.INSTANCE;
		mySingleton.sayHelloWorld();
		mySingleton.sayByeWorld();
		
		SingletonEnum otro = SingletonEnum.INSTANCE;
		otro.sayHelloWorld();
		otro.getMessage();
		
		//a new instance is not created so, the message is not set to Hi there!
		assertEquals(message, otro.getMessage());
	}

	
}

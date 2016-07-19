package com.wtao.hello;

/**
 * 
 * @author wtao
 *
 */
public class App {

	public static void main(String[] args) {
		sayHello("github");
		readHello();
	}

	private static void sayHello(String msg) {
		System.out.println("hello " + msg);
	}
	
	private static void readHello() {
		System.out.println("hello");
	}
}

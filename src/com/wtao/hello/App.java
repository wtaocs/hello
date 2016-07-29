package com.wtao.hello;

/**
 * 
 * @author wtao
 *
 */
public class App {

	public static void main(String[] args) {
		sayHello("github");
		sayHello("World");
		addNumber(10, 20);
	}

	private static void sayHello(String msg) {
		System.out.println("hello " + msg);
		System.out.println("李金洪");
	}
	
	private static  void addNumber(int a,int b) {
		System.out.println(a+b);
	}
}

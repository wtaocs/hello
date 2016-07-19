package com.wtao.hello;

/**
 * 
 * @author wtao
 *
 */
public class App {

	public static void main(String[] args) {
		sayHello("github");
		change();
	}

	private static void sayHello(String msg) {
		System.out.println("hello " + msg);
	}
	
	private static void change(){
		System.out.println("随便改改。。。");
	}
	
}

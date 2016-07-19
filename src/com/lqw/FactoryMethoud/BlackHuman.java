package com.lqw.FactoryMethoud;

public class BlackHuman implements Human {

	@Override
	public void speak() {

		System.out.println("黑人说我听不懂的话。");

	}

	@Override
	public void eat() {
		
		System.out.println("黑人喜欢吃白巧克力。");

	}

}

package com.lqw.FactoryMethoud;

public class WhiteHuman implements Human {

	@Override
	public void speak() {
		
		System.out.println("白人大部分的人说英语。");

	}

	@Override
	public void eat() {
		
		System.out.println("白人喜欢吃西餐。");
	}

}

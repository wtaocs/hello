package com.lqw.FactoryMethoud;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("生产白种人");
		WhiteHuman whiteHuman = (WhiteHuman) Factory.newHuman(WhiteHuman.class);
		whiteHuman.speak();
		whiteHuman.eat();
		
		System.out.println("生产种黑人");
		BlackHuman blackHuman = (BlackHuman) Factory.newHuman(BlackHuman.class);
		blackHuman.speak();
		blackHuman.eat();
		
		System.out.println("生产黄种人");
		YellowHuman yellowHuman = (YellowHuman) Factory.newHuman(YellowHuman.class);
		yellowHuman.speak();
		yellowHuman.eat();
		
		
	}

}

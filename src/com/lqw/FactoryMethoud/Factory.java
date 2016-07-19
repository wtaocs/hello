package com.lqw.FactoryMethoud;

public class Factory {
	//定义一个生产人类的方法
	public static Human newHuman(Class c){
		
		//定义一个人类类型
		Human human = null ;
		
		//产生一个人种
		try {
			human = (Human) Class.forName(c.getName()).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return human;
	}
	
}

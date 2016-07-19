package com.wtao.hello;

import java.util.Scanner;

/**
 * 
 * @author wtao
 *
 */
public class App {

	public static void main(String[] args) {
		sayHello("github");
		 Scanner r = new Scanner(System.in);
		 String str1 = r.next();
		 String str2 = r.next();
		 add(str1,str2);
	}

	private static void sayHello(String msg) {
		System.out.println("hello " + msg);
	}
	private static String add(String num1, String num2) {
		String sum = null;
		String temp;
		if (num1.length() < num2.length()) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		num1 = "0" + num1;// 给较长的一个数加一位，用来进位

		byte[] n1 = num1.getBytes();
		byte[] n2 = num2.getBytes();

		int index = n2.length;
		int flag = num1.length() - index;// 两个数相差的位数

		for (int i = n1.length - 1; i > 0; i--) {
			n1[i] = (byte) (n1[i] + n2[index - 1] - 48 * 2);
			if (n1[i] >= 10) {
				// 若相加之后的值>= 10,进位，即将前一个数值加1，当前数值-10
				n1[i - 1]++;
				n1[i] -= 10;
			}
			if ((--index) == 0) {// 较短的一个数加完了，跳出循环
				break;
			}
		}

		for (int i = 0; i < flag; i++) {
			n1[i] -= 48;
		}
		if (n1[0] != 0) {
			System.out.print(n1[0]);
		}
		for (int i = 1; i < n1.length; i++) {
			System.out.print(n1[i]);
		}
		// sum = Arrays.toString(n1);
		// System.out.println(sum);
		return sum;
	}
}

package com.bit.demo;

public class Branch {

	public static void main(String[] args) {
		//if 조건식: 참 or 거짓
			
		int num = 3;
		switch (num) { //상수식
		case 1:
		case 2:
		case 3:
			System.out.println("3");
			break;
		case 4:
			System.out.println("4");
		default: 
			System.out.println("default");
		}
	}
}

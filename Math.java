package com.bit.demo;

public class Math {

	public static void main(String[] args) {
		// 산술연산자 : 값 * %  
		
		int a = 3 ; 
		int b = 1 ; 
		int c = 4 ; 
		
		int num;
		//num = a + b + c;
		num = 0 ;
		num+= a ; //num = num + a;
		num = num + b ;
		num = num + c ;
		
		System.out.println(num);
		
		int num2 = 100 % 10; //0~9
		
		System.out.println(num2);
	}

}

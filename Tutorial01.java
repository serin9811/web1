package com.bit.demo;

import java.util.Scanner;

public class Tutorial01 {
	static Scanner= new Scanner (System.in);
//static 함수는 static함수만 호출시킬 수 있다.
	public static void main(String[] args) {
		//들어오는 시간 입력  시:분
		int in = getTime();
		
		//나가는 시간 입력
		int out = getTime();
		
		//시간 차 구하기
		int diff = diffTime(in, out);
	
		//요금 계산하기
		double price= getPrice(diff);
		
		System.out.println("price is" + price);
	}
	
	static int getTime() {
		int t = 0;
		t= sc.nextInt();
		return t; 
	}

	static int diffTime(int in, int out) {
		return out- in;
	}
	
	static double getPrice(int diff) {
		double price = 0.0;
		return price; 
	}
}

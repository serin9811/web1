package com.bit.demo;

public class DimOne {

	public static void main(String[] args) {
		//정수 배열 1차
		// 배열은 항상 길이를 알아야한다.
		int [] ar1 = new int [10] ;
		System.out.println(ar1);		
		System.out.println(ar1.length);
		
		for (int i = 0 ; i<ar1.length; i++) {
			System.out.println(ar1[1]);
		}
		
		//20개의 임의 정수들을 저장하라...
		
		int[] ran = new int [20];
		for(int i = 0; i <20 ; ++i) {
			ran[i] = (int)(Math.random()*100 );
			//Math.pow(a, b);
			//Math.sqrt(a);
			//표준 편차
		}
		for(int i = 0; i <20 ; ++i) {
			System.out.println(ran[i]);
		}
		
		//3자리 정수 2개를 비교해서 위치와 값을 판단하는 게임
		
	}

}

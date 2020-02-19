package com.bit.demo;
//제어문 연습
//1부터 25까지 연속하는 정수들 출력
// 여러가지 방법을 찾는다
//
//5행 5열 상태


public class Tutorial02 {
	
	public static void main (String[] args) {
	/*	int count = 0;
		for(int v = 1 ; v <=25 ; v++  ) {
		 System.out.print(v+ " ");
		 count+= 1 ;
		 
		 	if ( count ==5) {
		 		System.out.print("\n");
		 		count = 0;
		 		}
		} */
		int value = 1;
		
		for (int r = 0; r <5 ; ++r) {
			for (int c = 0; c< 5 ; c++) {
				System.out.println(value + " ");
			}
			value += 1;
			System.out.println();
			
		}
		
	}//main

}

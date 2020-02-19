package com.bit.demo;

public class Loop {

	public static void main(String[] args) {
		// iterator
		//조건식: 참인동안, 이면 계속해서 실행
		
		int n = 0;
/*		while (n < 10) {
			//반드시 멈춰야 한다...조건식이 거짓이 되어야한다.
			n += 1;
			if (n %5 == 0) {
				break;
			}
			}
		System.out.println(n); */
		
		
		do { //무조건 1번은 시행함
			n -= 2;
		} while(n >0);
		System.out.println(n);
		
		for (int i = 0 ; i < 20 ; ++i )  { //초기식 ; 조건식 ; 증감식  ---  for문은 생략이 가능하다. 생략하면 무한루프를 의미함.

		}
		
		for ( : ) {
			
		} 
	
	} 

	}


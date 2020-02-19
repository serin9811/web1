package com.bit.demo;

public class Tutorial03 {

	public static int[] ballCount(int a , int b) {
		int[] count = new int[2]; //[0]Strike [1]Ball
		//10진 정수: 일, 십, 백
		String as = String.valueOf(a);
		char[] achar = as.toCharArray();
		
		String bs = String.valueOf(b);
		char[] bchar = bs.toCharArray();
		
		System.out.println(achar);
		System.out.println(bchar);
		
		for (int ai= 0; ai<achar.length; ++ai) {
			for (int bi=0; bi<bchar.length; ++bi) {
				if (achar[ai] == bchar[bi]) {
					if (ai == bi) { //위치의 개념
						count[0]++ ; //strike
					} else {
						count[1]++; //ball
					}
				}
			}
		}
	return count;//return은 왜써요?
	}
			
			
		public static void main (String[] args) {
		
		int[] count = ballCount (345, 456);
		System.out.println("Strike:" + count[0]);
		System.out.println("Ball:" + count[1]);
		
	
			}
}


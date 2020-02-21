package com.bit.demo.oop;

public class AdvPhone extends Phone {
//Phone의 기능을 확장한다.
//상속을 받더라도 부모 class에서 private으로 지정된 것은 상속 받을 수 없다.
	private String number;
	public void setNumber(String number) {
		this.number= number;
	}
	
	@Override 
	public void rcv() {
		//호출하는 방법은 유지하되 실행의 결과가 다르게...
		System.out.println(number+ "...");
		System.out.println("전화받기...");
		
	}
}

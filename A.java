package com.bit.demo.oop;
 /**
  * class를 만든다는 것은...
  * 1.복합적인 자료형을 새로 만든다.
  * 2.현실의 모든 것을 추상적 개념화 ( 살아있다...)
  *
  * class: 연관성이 깊은 것들을 한데 모은 단위...
  *  -최소, 필수 정보, 처리를 모아라...
  *  - 가장 최소, 필수 정보의 data 필요한 것...
  * 
  * 
  * @author BIT02-16
  *
  */
public class A {
	//접근자 (public || private): 사용 권한, 범위
	//접근자를 쓰지않았으면 같은 package안에서는 공유하여 사용가능하다.
	//접근자가 private이면 같은 package라도 공유할 수 없다. 이 때는 getter, setter를 이용
	//필드는 private, 메서드는 public
	private int a_num ; //(default) int a_num
	
	public A() {} //이걸 왜 써준다고??
	public A(A origin) {
		this.a_num= origin.getAnum();
		
	}
	
	public int getAnum() {
		return a_num;
	}
	
	public int setAnum(int v) {
		return a_num= v;
	}
	
	

}

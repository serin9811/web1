package com.bit.demo.oop;

public class Sample {
	//객체 지향 개념, 문법 -독립적인...
	//독립된 객체들의 조합(연결)하는 방법을 찾아라...
	//함수 함수로 전달한다.... 복사해서 주니까 값의 변경 여부 잘 생각할 것.
	
	public static void main(String[] args) {
//	A aInst = new A(); //인스턴스화==메모리 로딩
//		aInst.a_num = 11;
		
//		A aInst1 = new A(); //인스턴스화==메모리 로딩
//		A aInst1 = aInst; 	//오른쪽 변수의 값을 왼쪽 변수에 '저장'한다.
//		//aInst와 aInst1은 이름은 같지만 참조(주소, 경로)가 다르다.
//		aInst1.a_num = aInst.a_num; //값 복사...
//		aInst1.a_num++; //aInst와 aInst1의 값은 다르다..
		
//		System.out.println(
//				aInst.a_num + " vs " +
//				aInst1.a_num
//				); *//
//
//		A a = new A();
//		a.setAnum(3);
//		B b = new B();
////		b.todo(a); //todo.a= a; 매개 생성자
//		b.todo(new A(a)); //복사 생성자
//		System.out.println(a.getAnum());
		
//		Object p1= new AdvPhone(); //object는 최상위 타입.단군할아버지급.
		Phone p1= new AdvPhone();  //자식의 인스턴스를 부모 타입으로 받을 수 있다???
		//부모의 인스턴스는 자식 타입으로 받을 수 없다. 범위: 자식 > 부모
		//부모의 인스턴스는 부모 타입으로만 받을 수 있다.
		//실 생성 타입이 무엇인지 주의할 것. 
		p1.rcv();
		p1.call();
//		AdvPhone p2 = (AdvPhone)p1; //참조복사 . 형변환
		AdvPhone p2= (AdvPhone)p1;
		p2.setNumber("010-1234-1234");
		p2.rcv();
		p2.call();
		
		//오버라이딩... 오버로딩...
		
		
	}
	
}

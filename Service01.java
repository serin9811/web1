package com.bit.demo.carpark;
/** 
 * 클래스의 용법
 * @author BIT02-16
 *
 */
public class Service01 {
	//field(필드) : private
	private int code; 
	private String name; 
	
	
	// method (매서드) : public
	public String toString() {
		//현재 인스턴스의 필드들을 문자열로 반환한다.
		//Type@Address
		String s = " Service { ";
		s+= "code: "+code+ "," ;
		s+= "name: "+name+"}";
		
		return s;
		
	}
	
	
	//Constructor (생성자): VM에서 자동으로 만들어준다...
	public Service01(){
		//기본 생성자 
		// instance에 대한 초기화 
		code =0;
		
	}
	
	//getter, setter: field 값 반환하거나 저장 하는 등의 처리
	public int getCode(){ //get은 현재 값을 반환
		return code;
		
	}
	public void setCode(int code){ //set은 현재 값을 저장
		//외부의 값을 받을 때는 검사를 해야함.
		this.code = code; //this. : 현재 인스턴스를 의미
		
	}
	public String getName() { //getter는 field값의 type을 따른다.
		
		return name;
		
	}
	public void setName(String name){
		this.name = name; 
	}
	
}

package com.bit.demo.carpark;

import com.bit.demo.carpark.model.Car;

public class Space {
	
	private Car[] carList;
	
	//배열에 대한 처리 CRUD
	//배열 안에 저장되는 각각의 데이터 - 요소 
	//요소는 정수 번호로 구분/ [0] ~ [배열명.length-1]
	//요소명 = 배열명[번호]
	
	public Space(int size) {
		//생성자를 만들면... Space() VM에 의해 만들어 지지않는다.
		carList = new Car[size];//배열 길이가 있어야 하고 고정.
	}
	
	public Car selectByNo(String no) {
		int i = indexOfNo(no);
		return carList[i];
	}
	
	public int indexOfNo(String no) {
		for (int i =0; i<carList.length; ++i) { //for문을 쓰는 이유는 요소번호가 필요하기때문.
			if(carList[i] != null &&
					carList[i].getNo().equals(no)) {
				return i ; 	
			}
		}
		return -1;
		
	}
	
	private int isEmpty() {
		for (int i =0; i<carList.length; ++i) { //for문을 쓰는 이유는 요소번호가 필요하기때문.
			
			if(carList[i]==null) {
				return i ; 
				
			}
		}
//		for (Car c: carList) {}
		return -1;//만차...
	}
	public boolean save(Car car) {
		//주차장에 차가 들어왔다...
		boolean state= false; 
		int idx = isEmpty();
		if( idx > -1 ) {//size보다 큰 값으로 해도 
			carList[idx] =car;
			state =true;
			
		}	
		return state; 
	}
	//함수 실행 결과, 목적이 같다...
	public void clean(int idx) {
		//주차장에 차가 나갔다...
		carList[idx] = null; //NullPointerException처리를 항상 할 것.
	}
	public void clean(String no) {
		//주차장에 차가 나갔다...
		int idx=indexOfNo(no);
		carList[idx] =null;
		
	}
}

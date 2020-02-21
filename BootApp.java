package com.bit.demo.carpark;

//import는 코드 상단에 쓴다. 제일 마지막에 Scanner라는 클래스명 대신 *을 쓰면 wild card
import java.util.Scanner;

import com.bit.demo.carpark.model.Car;

public class BootApp {
/** 
 * 콘솔 환경에서 실행하기 위한 시작함수-main
 * -public: 공객
 * -static : 정적, 클래스 멤버, 클래스명.main()으로 사용가능
 * -void: 반환없음, 없음
 * 
 * 콘솔 입출력 담당
 * @param args:문자열 여러 개 (배열
 * @return
 * 
 * 클래스를 사용하려면 클래스형 변수를 만들어야한다.
 */
	public static void main(String[] args) {
		//입력 input은 인스턴스 of Scanner
		
		ParkService service = new ParkService();
		Scanner input = new Scanner (System.in);
		/**Service01 service = new Service01(10,"car park");
		System.out.println(service); **/
		//초기화
		
		while(true) {
			System.out.println("[1]In [2]Out [3]Exit > ");
			String menu = input.nextLine();
			if (menu.equals("3")) {
				System.out.println("안녕히 가세요");
				break;
			}//실제 실행내용
			
			if (menu.equals("2")) {
				System.out.println("요금 정산: 차 나갈 때");
				System.out.println("차량 번호: ");
				String carno = input.nextLine();
				Car car = service.getCar(carno);
				if (car == null)
				{
					System.out.println("등록된 차량이 아닙니다.");
				} else {
					System.out.println("나가는 시간 입력하세요");
					int outTime = Integer.parseInt(
						input.nextLine()
						);
					car.setOuttime(outTime);
					System.out.println("요금: ");
					//(inTime, outTime)
					double price = service.getPrice();
					System.out.println(price);
					//들어와서 저장했던 기록 - 비우기
					System.out.println("나갔음 청소하기");
					service.outCome(car);
					
				}
			}
			
			if (menu.equals("1")) {
				Car car = new Car ();
				
				System.out.println("시간 기록: 차 들어올 때");
				System.out.println("차량 번호: ");
				String carno= input.nextLine();
				car.setNo(carno);
				
				System.out.println("들어온 시간 : "); 
				//사용자 HHmm 숫자입력
				int inTime = Integer.parseInt(
						input.nextLine()) ;
				car.setIntime(inTime);
				System.out.println(car);
				service.comeIn(car);
			}
		}//while의 끝
		
		
		//닫기: 정리 
		// .전의 값이(현재 input자리) null이 아니어야한다.
		if( input != null) {input.close();}
	}//main end

}

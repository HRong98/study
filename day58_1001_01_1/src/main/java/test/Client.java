package test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		
		/*스프링컨테이너 factory = new 스프링컨테이너();
		factory야.폰객체좀("아이폰");*/
		//추상클래스 new X
		// 컨테이너는 .xml파일 필요!
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		// 컨테이너를 구동시키는 코드
		
		Phone phone = (Phone)factory.getBean("samsung");
//		// Bean == 자바객체 == 객체 == POJO
//		// 객체를 요청하다 == look up
//				
		phone.turnOn();
		phone.turnOff();
////		
////		
////		Phone p1 = (Phone)factory.getBean("samsung");
////		Phone p2 = (Phone)factory.getBean("samsung");
////		Phone p3 = (Phone)factory.getBean("samsung");
////		/*Phone p1= new Samsung();
////		Phone p2=p1;
////		Phone p3 = p1;*/
////		p1.turnOn();
////		p2.turnOn();
////		p3.turnOn();
//		//Watch watch = (Watch)factory.getBean("samsung");
//		
//		//watch.powerOn();
//		//watch.powerOff();
		factory.close();
	}
}

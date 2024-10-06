package test;

import org.springframework.stereotype.Component;

@Component("aw")
public class AppleWatch implements Watch {

	public AppleWatch() {
		System.out.println("애플워치 생성자 호출");
	}
	
	@Override
	public void powerOn() {
		System.out.println("애플워치 On");
		
	}

	@Override
	public void powerOff() {
		System.out.println("애플워치 Off");
		
	}
	
}

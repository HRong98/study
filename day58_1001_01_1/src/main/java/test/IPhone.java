package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("apple")
public class IPhone implements Phone {
	@Autowired // 메모리의 자료형(타입)을 인지해서 주입해줌
	@Qualifier("aw")
	private Watch watch; // 의존주입 DI 대상
	
	public IPhone() {	
		System.out.println("아이폰 객체 생성 01");
	}
//	public IPhone(Watch watch) {
//		this.watch = watch;
//		System.out.println("아이폰 객체 생성 02");
//	}
//	public IPhone(Watch watch, int num) {
//		this.watch = watch;
//		System.out.println("아이폰 객체 생성 02");
//		System.out.println("num : "+this.num);
//	}
	// 아이폰은 워치에 대해 의존성을 갖는다	
	// 객체를 멤버변수로 두면 유지보수 용이해짐
	@Override
	public void turnOn() {
		//AppleWatch watch = new AppleWatch();
		this.watch.powerOn();
	}

	@Override
	public void turnOff() {
		//AppleWatch watch = new AppleWatch();
		this.watch.powerOff();
	}
}

package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("samsung") // 객체 생성
public class GalaxyPhone implements Phone{
	@Autowired //의존 주입
	@Qualifier("gw")
	private Watch watch;
	
	public GalaxyPhone() {
		System.out.println("갤럭시 객체 생성");
	}
//	public GalaxyPhone(Watch watch) {
//		this.watch= watch;
//		System.out.println("갤럭시 객체 생성 02");
//	}
//	public GalaxyPhone(Watch watch, String num) {
//		this.watch=watch;
//		System.out.println("갤럭시 객체 생성 03");
//	}
	
	@Override
	public void turnOn() {
		System.out.println("갤럭시 전원 ON");
	}
	
	@Override
	public void turnOff() {
		System.out.println("갤럭시 전원 OFF");
	}
}

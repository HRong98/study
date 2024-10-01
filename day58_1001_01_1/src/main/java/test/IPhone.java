package test;

public class IPhone implements Phone {
	private int num;
	
	public IPhone() {
		//this.num = 1234; //멤버변수 초기화 == 생성자의 역할
		System.out.println("아이폰 객체 생성");
	}
	
	public void initMethod() {
		this.num = 1234;
		System.out.println("생성자 역할(멤버변수 초기화)을 대신하는 init() 함수");
	}
	
	@Override
	public void turnOn() {
		System.out.println("아이폰 전원 ON");
	}
	
	@Override
	public void turnOff() {
		System.out.println("아이폰 전원 OFF");
	}
}

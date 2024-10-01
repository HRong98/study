package test;

public class GalaxyPhone implements Phone{
	private int num;
	public GalaxyPhone() {
		System.out.println("갤럭시 객체 생성");
	}
	
	@Override
	public void turnOn() {
		System.out.println("갤럭시 전원 ON"+this.num);
	}
	
	@Override
	public void turnOff() {
		System.out.println("갤럭시 전원 OFF");
	}
}

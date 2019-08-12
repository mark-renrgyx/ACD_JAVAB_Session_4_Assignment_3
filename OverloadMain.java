package week1.day4.overloading;

public class OverloadMain {

	public static void main(String[] args) {
		Overloading o = new Overloading();
		
		System.out.println("Let's make a String: " + o.makeString());
		System.out.println("Let's make more: " + o.makeString(5));
	}
}

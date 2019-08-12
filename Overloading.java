package week1.day4.overloading;

public class Overloading {
	public String makeString () {
		return "It's a String";
	}
	public String makeString(int num) {
		String s = "";
		for (int i = 0; i < num; i++) {
			s += this.makeString() + ' ';
		}
		return s;
	}
}

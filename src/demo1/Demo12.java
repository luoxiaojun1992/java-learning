package demo1;

public class Demo12 {
	String name = "haha";
	
	static String father = "George";
	
	final static double PRICE = 0.123;
	
	public int getValue() {
		return _getValue();
	}
	
	private static int _getValue() {
		return 1;
	}
	
	public static int getConfig() {
		return 2;
	}
	
	public Demo12() {
		name = "hehe";
	}
}

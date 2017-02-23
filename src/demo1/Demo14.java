package demo1;

public class Demo14 extends Demo12 {
	private static int _getValue() {
		return 2;
	}
	
	public int getValue2() {
		return _getValue();
	}
}

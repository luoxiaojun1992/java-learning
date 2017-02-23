package demo1;

import demo1.Demo17;

public class Demo16 {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			(new Demo15(i)).start();
		}
		
		for (int i = 0; i < 3; i++) {
			new Thread(new Demo17(i)).start();
		}
	}
}

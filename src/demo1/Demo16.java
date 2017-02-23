package demo1;

public class Demo16 {
	public static void main(String[] args) {
		(new Demo15(1)).start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException ie) {
			System.out.println(ie.getMessage());
		}
		new Thread(new Demo17(1)).start();
	}
}

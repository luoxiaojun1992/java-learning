package demo1;

public class Demo17 implements Runnable {
	int j;
	
	static int shared;
	
	public Demo17(int i) {
		j = i;
	}
	
	public void run() {
		System.out.println(j);
		modifyShared();
	}
	
	private static synchronized void modifyShared() {
		shared = shared + 1;
		System.out.println("shared:");
		System.out.println(shared);
	}
}

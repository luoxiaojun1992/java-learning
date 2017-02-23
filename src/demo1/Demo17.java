package demo1;

public class Demo17 implements Runnable {
	int j;
	
	public Demo17(int i) {
		j = i;
	}
	
	public void run() {
		System.out.println(j);
	}
}

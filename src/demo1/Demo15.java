package demo1;

public class Demo15 extends Thread {
	int j;
	
	public Demo15(int i) {
		j = i;
	}
	
	public void run() {
		System.out.println(j);
	}
}

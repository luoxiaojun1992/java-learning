package demo1;

import java.io.IOException;
import java.io.PipedWriter;

public class Demo17 implements Runnable {
	int j;
	
	static int shared;
	
	public static PipedWriter writer = new PipedWriter();
	
	public Demo17(int i) {
		j = i;
	}
	
	public void run() {
//		System.out.println(j);
		modifyShared();
	}
	
	private static synchronized void modifyShared() {
//		shared = shared + 1;
//		System.out.println("shared:");
//		System.out.println(shared);
		
		try {
			writer.write("a");
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
}

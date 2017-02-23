package demo1;

import java.io.IOException;
import java.io.PipedReader;

public class Demo15 extends Thread {
	int j;
	
	public PipedReader reader;
	
	public Demo15(int i) {
		j = i;
		try {
			reader = new PipedReader(Demo17.writer);
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public void run() {
//		System.out.println(j);
		
		try {
			System.out.println((char)reader.read());
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
}

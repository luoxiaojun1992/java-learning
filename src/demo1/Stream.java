package demo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stream {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s = r.readLine()) != null && s.length() > 0) {
			System.out.println(s);
		}
	}
}

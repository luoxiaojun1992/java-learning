package demo1;

import java.util.Arrays;

import demo1.Demo12;

public class Demo11 {
	public static void main(String[] args) {
		System.out.println("demo11");
		System.out.println(0.12345f);
		System.out.println(0.12345);
		System.out.println(0.12345E3f);
		
		boolean a = false;
		System.out.println(a);
		
		Demo12 demo12 = new Demo12();
		System.out.println(demo12.getValue());
		
		int[] b = new int[10];
		b[0] = 1;
		int[] c = new int[]{3,1,2};
		System.out.println(b[0]);
		System.out.println(c[0]);
		
		System.out.println(b.equals(c));
		
		String str = new String("12345");
		System.out.println(str.contains("1"));
		System.out.println(str.indexOf('1'));
		
		System.out.println(112 == 111);
		
		System.out.println(Demo12.getConfig());
		
		for (int i = 0; i < c.length; ++i) {
			System.out.println(c[i]);
		}
		
		int[] copyArray = Arrays.copyOf(c, 2);
		System.out.println(copyArray[1]);
		
		Arrays.fill(b, 1, 10, 8);
		System.out.println(b[9]);
		
		Arrays.sort(c, 0, 3);
		for (int i = 0; i < c.length; ++i) {
			System.out.println(c[i]);
		}
		
		System.out.println(Arrays.binarySearch(c, 2));
		
		String str2 = new String(new StringBuffer("6789"));
		
		System.out.println(str.concat(str2));
		
		StringBuffer str3 = new StringBuffer("6789");
		System.out.println(str3.length());
		System.out.println(str3.capacity());
		System.out.println(str2.length());
		
		char[] s_char = new char[str2.length()];
		for (int i = 0; i < str2.length(); ++i) {
			s_char[i] = str2.charAt(i);
		}
		System.out.println(String.copyValueOf(s_char, 0, 4));
		
		System.out.println(str.substring(0, 3));
		System.out.println(str.substring(3));
		
		String lstr = "abcd";
		System.out.println(lstr.toUpperCase());
		String ustr = "ABCd";
		System.out.println(ustr.toLowerCase());
		System.out.println(str.split("3")[0]);
		
		System.out.println(str.replace('1', '3'));
		System.out.println(str.replaceAll("12", "34"));
		System.out.println(str.replaceFirst("12", "34"));
	}
}

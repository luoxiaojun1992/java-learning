package demo1;

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
		int[] c = new int[]{1,2,3};
		System.out.println(b[0]);
		System.out.println(c[0]);
		
		System.out.println(b.equals(c));
		
		String str = new String("12345");
		System.out.println(str.contains("1"));
		System.out.println(str.indexOf('1'));
		
		System.out.println(111 == 111);
		
		System.out.println(Demo12.getConfig());
		
		for (int i = 0; i < c.length; ++i) {
			System.out.println(c[i]);
		}
	}
}

package demo1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import demo1.Demo12;

public class Demo13 {

	public static void main(String[] args) {
		
		List l = new ArrayList<String>();
		l.add(new String("demo13"));
		System.out.println(l.get(0));

		Iterator i = l.iterator();
		while(i.hasNext()){
			System.out.println(i.next().toString());
		}
		
		System.out.println((new Demo12()).name);
		
		System.out.println(Demo12.father);
	}

}
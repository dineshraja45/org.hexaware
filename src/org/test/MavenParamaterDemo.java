package org.test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class MavenParamaterDemo {
	
	public int m1() {
				return 100;
	}

	public ArrayList<Integer> m2 (){
		
		ArrayList<Integer> li=new ArrayList<>();
		li.add(100);
		li.add(200);
		li.add(100);
		li.add(1000);
		li.add(2, 500);
		return li;
	}
	
	private Map<String, String> m3() {
		
		Map<String,String > m =new LinkedHashMap<>();
		m.put("name", "dinesh");
		m.put("email", "bala@gmail.com");
		return m;

	}

	
	
	public static void main(String[] args) {
		
		MavenParamaterDemo t=new MavenParamaterDemo();
		
		int m1 = t.m1();
		System.out.println(m1);
		
		ArrayList<Integer> li = t.m2();
		
		for (int i = 0; i < li.size(); i++) {
			 Integer integer = li.get(i);
			 System.out.println(integer);
			
		}
		Map<String, String> m3=t.m3();
System.out.println(m3);
	

		
		
		
		
	
		
		
		}
	
	
	
	
}

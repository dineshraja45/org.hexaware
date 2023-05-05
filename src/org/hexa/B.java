package org.hexa;

public class B {
	private int test(int empId) {
		int res=0;
		if (empId==10) {
			res=100;
			
		}if (empId==100) {
			res=1000;
		}if (empId==1000) {
			res=100000;
		}
		return res;
	}
	public static void main(String[] args) {
		B b=new B();
		 b.test(100);
		System.out.println("Hello Dinesh");
		
	}

}

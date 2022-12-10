package org.hexa;

public class A {
	
	public void method1() {
		// TODO Auto-generated method stub

	}
	public void method2() {
		// TODO Auto-generated method stub
		
	}
	
	
	

	private int method(int empId) {

		if (empId == 10) {
			return 100;

		}
		if (empId == 100) {
			return 1000;

		}
		return 0;

	}

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.method(100));

	}
}

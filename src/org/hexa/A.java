package org.hexa;

public class A {

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

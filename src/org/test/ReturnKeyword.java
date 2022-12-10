package org.test;

public class ReturnKeyword {
	
   private int test(int  empId) {
	   
	   if (empId==10) {
		return 100;
	}
	return 0;
}
	
   public static void main(String[] args) {
	   
	ReturnKeyword r=new ReturnKeyword();
	int test = r.test(10);
	System.out.println(test);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

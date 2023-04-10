package com.tnsif.string;

public class WrapperClassDemo {
	public static void main(String[] args) {
		
		

		// unboxing
		
		Integer i=new Integer(10);
		System.out.println(i);

		int b=i.intValue();
		System.out.println(b);
		
		
		//without intvalue
		int c=i;
		System.out.println(c);
		
		// autoboxing
		
		int a= 100;
		Integer d=a;
		
		System.out.println(d);
		
		
	}
	
}

package com.lti.demos;

public class TestCalc {
	
	public static void main(String args[]) {
		
		Calculator a= new Calculator();
		System.out.println(a.sayHello());
		
		System.out.println(a.add(20, 10));
		System.out.println(a.sub(20, 10));
		
		Products p = new Products(2,3);
		
		System.out.println("The line is added");
	}
}

package com.sushant.inheritance;



//superclass
class B{
	int i = 10;
	void test1() {
		System.out.println("Running test1() of B class");
	}
}
//subclass
class A extends B{
	double d = 2.3;
	void demo1() {
		System.out.println("Running demo1() of B class");
	}
}
public class Demo1 {
	
public static void main(String[] args) {
		
	System.out.println("Program Starts");
	A aref = new A();
	aref.test1();
	aref.demo1();
	System.out.println("Program Ends");
	}


}
package com.text.app;

public class OperatorsExample {

	public static void main(String[] args) {
		int a=10,b=20;
		int result=(a<b)?a:b;
		System.out.println(result);
		
		//Arithmetic operator
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		//Relation operator
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		System.out.println(a==b);
		
		//Logical operator
		System.out.println((a!=b)&&(a>b));
		System.out.println((a!=b)||(a>b));
		
		//Shift operator
		System.out.println(a>>2);
		System.out.println(b<<2);
		
		//Assignment operator
		System.out.println(a+=10);
		System.out.println(a=a+10);
		System.out.println(a=a*b);
		System.out.println(a*=b);
		
	}

}

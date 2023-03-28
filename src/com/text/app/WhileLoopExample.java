package com.text.app;

public class WhileLoopExample {

	public static void main(String[] args) {
		int i=1;
		boolean status=true;
		while(status)
		{
			System.out.println(i);
			if(i==50)
			{
				status=(false);
			}
			i=i+1;
		}

	}

}

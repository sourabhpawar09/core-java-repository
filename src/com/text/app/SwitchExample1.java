package com.text.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchExample1 {

	public static void main(String[] args) throws NumberFormatException, IOException{
		InputStreamReader ins=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ins);
		
		
		System.out.println("Enter Initial letters of weekday.");
		String choice=br.readLine();
		
        switch(choice)//Fall through execution
        {
        case "S": System.out.println("Sunday");
              break;
        case "M": System.out.println("Monday");
              break;
        case "T": System.out.println("Tuesday");
              break;
        case "W": System.out.println("Wednesday");
              break;
        case "Th": System.out.println("Thursday");
              break;
        case "F": System.out.println("Friday");
              break;
        case "Sa": System.out.println("Saturday");
              break;
        default:System.out.println("Wrong Choice...");      
        }
        
        System.out.println("To exit pressy");
        String v=br.readLine();
        if(v.equals("y")||v.equals("Y"))
        {
        	exit=false;
        }
	    }while(exit);
        	
	    
	}

}


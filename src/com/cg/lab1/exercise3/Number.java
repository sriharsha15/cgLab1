package com.cg.lab1.exercise3;

public class Number {
	
 boolean checkNumber(int number)
	{
	         while(number>0)
	       {
	    	   int temp = number % 10;
		       number = number/10;
	           if(temp < number % 10)
	           {
	             return false;
	           }
	           
	       }
	       return true; 
	}
}

package com.demo;


class DivideByZero extends Exception
{
	DivideByZero(String s)
	{
		
		super(s);
	}
     
}


public class DemoCustomException {

	public static void main(String[] args) {
	    int i=10;
	    int j=0;
	    try 
	    {
			
		int k=i/j;
		if(k==0)
		throw new DivideByZero("Not possible");
        System.out.println(k);


	    } 
	    catch (Exception e)
	    {
			System.out.println("Error"+e.getMessage());
		}
	    		

	}

}

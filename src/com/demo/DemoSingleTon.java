package com.demo;
class SingleTone
{
	
	private static SingleTone st;
	private SingleTone()
	{}
public static SingleTone getInstance()
{
	if(null==st)
	{
		
		st=new SingleTone();
	}
	return st;
}
}

public class DemoSingleTon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleTone s=SingleTone.getInstance();
		System.out.println("In main method");
	}

}

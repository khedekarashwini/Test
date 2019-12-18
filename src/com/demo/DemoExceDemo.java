package com.demo;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

class Stud
{
    public void m1() throws IOException
    {
    	System.out.println("In m1 Method of Stud");
        
    }
}
class Teach extends Stud
{
public void m1() throws EOFException
{
System.out.println("In m1 Method of teach ");

}

}
public class DemoExceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

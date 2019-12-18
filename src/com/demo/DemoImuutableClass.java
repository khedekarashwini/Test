package com.demo;



final class Employee
{
	final int id;
	final String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	
	
   
}
public class DemoImuutableClass {

	public static void main(String[] args) {
		
         Employee e1=new Employee(1, "ashu");
         System.out.println("Id.."+e1.id+"   "+"Name.."+e1.name);
        
         
         Employee e2=new Employee(2, "Dikasha");
         System.out.println("Id.."+e1.id+"   "+"Name.."+e1.name);

	}

}

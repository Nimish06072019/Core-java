package com.Employee;

public class Tester extends Employee {
	
	String[] tools;

	public Tester(int id, String name, String dept, double salary,String[] tools) {
		super(id, name, dept, salary);
		System.out.println("Inside Tester Constructor");
		this.tools = tools;
	}
	
	@Override
	protected void work() {
		super.work();
		System.out.println(name +" is managing " + tools);
		for(int i=0;i<tools.length;i++) {
			System.out.println(tools[i]);
		}
	}
}

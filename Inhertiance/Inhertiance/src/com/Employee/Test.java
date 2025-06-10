package com.Employee;

public class Test {

	public static void main(String[] args) {

		String[] projects = new String[] {"Flight Reservation","Check In"};
		Manager manager = new Manager(1,"Rajveer","Travel",100000,projects);
		System.out.println(manager.id);
		System.out.println(manager.name);
		System.out.println(manager.dept);
		System.out.println(manager.salary);
		manager.work();
		
		
		Developer developer = new Developer(2, "Nimish", "Travel", 2000000,"Full Stack Developer");
		developer.work();
		
		String[] tools = new String[] {"Seleninum","BugZilla","Cypress"};
		Tester tester = new Tester(3, "Mayank", "Travel", 10, tools);
		tester.work();
		
	}

}

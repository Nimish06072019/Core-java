package com.emc.test;

import com.emc.entities.Event;
import com.emc.entities.Organizer;

public class Test {

	public static void main(String[] args) {
		
		Organizer organizer = new Organizer();
		organizer.id = (long) 1233;
		organizer.name = "Apple Inc";
		System.out.println(organizer);
		System.out.println(organizer.id);
		
		
		Event event = new Event((long) 123123,"Iphone 100 Launch","Grand Launch");
		System.out.println(event.description);
		
	}

}

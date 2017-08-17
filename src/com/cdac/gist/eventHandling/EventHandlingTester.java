package com.cdac.gist.eventHandling;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EventHandlingTester {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.cdac.gist");
		//context.start();
		HeloWorld object=context.getBean(HeloWorld.class);
		System.out.println(object.getMessage("Kapil"));
		System.out.println("Finishing application");
		context.stop();
		//context.start();
		HeloWorld object1=context.getBean(HeloWorld.class);

		System.out.println(object1.getMessage("mahesh"));
	}
}

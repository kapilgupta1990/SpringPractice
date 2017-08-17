package com.cdac.gist.customevent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EventHandlingTester {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.cdac.gist.customevent");
		context.start();
		CustomEventPublisher publisher=(CustomEventPublisher) context.getBean("customEventPublisher");
		publisher.publish();
		
	}
}

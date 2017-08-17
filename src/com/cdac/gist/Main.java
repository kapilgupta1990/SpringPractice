package com.cdac.gist;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext("com.cdac.gist");
		context.start();
		System.out.println("Finishing application");
	}
}

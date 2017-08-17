package com.cdac.gist.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AOPTester {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.cdac.gist.aop");
		LoggingClass lc=(LoggingClass) context.getBean("loggingClass");
		System.out.println(lc.add(10, 30));

	}
}

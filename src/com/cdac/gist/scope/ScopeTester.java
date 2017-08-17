package com.cdac.gist.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopeTester {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.cdac.gist.scope");
		SingleTonScope lc = (SingleTonScope) context.getBean("singleTonScope");
		SingleTonScope lc1 = (SingleTonScope) context.getBean("singleTonScope");
		AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext("com.cdac.gist.scope");
		SingleTonScope lcc = (SingleTonScope) context1.getBean("singleTonScope");
		SingleTonScope lcc1 = (SingleTonScope) context1.getBean("singleTonScope");
		System.out.println(lc);
		System.out.println(lc1);
		System.out.println(lcc);
		System.out.println(lcc1);
	}

}

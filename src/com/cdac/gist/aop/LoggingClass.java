package com.cdac.gist.aop;

import org.springframework.stereotype.Component;

@Component
public class LoggingClass {

	
	public long add(long l1, long l2){
		System.out.println("Method Entry");
		long l3=l1+l2;
		if(l1==1l){
			throw new IllegalArgumentException("Value is not allowed "+l1);
		}
		System.out.println("Method Exit");
		return l3;
	}
}

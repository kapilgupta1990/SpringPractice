package com.cdac.gist.aop;

import javax.annotation.PostConstruct;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(value=2)
public class MyAspect {

	@PostConstruct
	public void init(){
		System.out.println("Inside init");
	}
	
	@Before(value = "execution(* LoggingClass.add(..))")
	public void logBefore(){
		System.out.println("Logging before method execute MyAspect");
	}
	@After(value = "execution(* LoggingClass.add(..))")
	public void logAfter(){
		System.out.println("Logging after method execute MyAspect");
	}
//	@AfterReturning(value = "execution(* LoggingClass.add(..))")
//	public void logAfterReturning(){
//		System.out.println("Logging after method returning");
//	}
//	@AfterThrowing(value = "execution(* LoggingClass.add(..))")
//	public void logAfterThrowing(){
//		System.out.println("Logging after method throwing exception");
//	}
//	@Around(value = "execution(* LoggingClass.add(..))")
//	public void loggingAround(){
//		System.out.println("Logging arround");
//	}
}

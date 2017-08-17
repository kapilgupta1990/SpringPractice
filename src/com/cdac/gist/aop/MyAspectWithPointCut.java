package com.cdac.gist.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(value=1)
public class MyAspectWithPointCut {
	@Before(value="definePointCut()")
	public void logBefore() {
		System.out.println("Logging before method execute MyAspectWithPointCut");
	}
	 @After(value = "definePointCut()")
	 public void logAfter(){
	 System.out.println("Logging after method execute MyAspectWithPointCut");
	 }
	 @AfterReturning(value = "definePointCut()",returning="retVal")
	 public void logAfterReturning(Object retVal){
	 System.out.println("Logging after method returning that is "+retVal);
	 }
	 @AfterThrowing(value = "definePointCut()",throwing="ex")
	 public void logAfterThrowing(Exception ex){
	 System.out.println("Logging after method throwing exception" +ex.getMessage());
	 }
	// @Around(value = "execution(* LoggingClass.add(..))")
	// public void loggingAround(){
	// System.out.println("Logging arround");
	// }
	
	@Pointcut(value="execution(* LoggingClass.add(..))")
	private void definePointCut(){
		
	}
}

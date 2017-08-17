package com.cdac.gist.aop;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(value = 3)
public class MyAspectWithPointCutAndJoinPoint {
	@Before(value = "definePointCut()")
	public void logBefore() {
		System.out.println("Logging before method execute MyAspectWithPointCutAndJoinPoint ");
	}

	@Pointcut(value = "execution(* LoggingClass.add(..))")
	private void definePointCut() {

	}
}

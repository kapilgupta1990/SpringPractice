package com.cdac.gist.aop;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class MConfiguration {
//	@PostConstruct
//	public void init(){
//		System.out.println("My configuration");
//	}
}

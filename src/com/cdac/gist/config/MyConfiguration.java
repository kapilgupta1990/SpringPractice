package com.cdac.gist.config;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

	@PostConstruct
	public void mInit(){
		System.out.println("Inside post method");
	}
}

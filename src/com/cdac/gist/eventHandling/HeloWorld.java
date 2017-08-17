package com.cdac.gist.eventHandling;

import org.springframework.stereotype.Component;

@Component
public class HeloWorld {

	public String getMessage(String name){
		return "Welcome "+name;
	}
}

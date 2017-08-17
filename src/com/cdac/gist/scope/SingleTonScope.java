package com.cdac.gist.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName="session")
public class SingleTonScope {

	
	public SingleTonScope() {
		
	}
	private String getMessage(){
		return "Hi this is singleton "+this;
	}
}

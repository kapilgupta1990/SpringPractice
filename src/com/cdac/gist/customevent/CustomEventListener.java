package com.cdac.gist.customevent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CustomEventListener implements ApplicationListener<CustomEvent>{

	@Override
	public void onApplicationEvent(CustomEvent arg0) {

		System.out.println(arg0);
	}

}

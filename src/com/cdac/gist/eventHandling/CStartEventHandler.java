package com.cdac.gist.eventHandling;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.stereotype.Component;
@Component
public class CStartEventHandler implements ApplicationListener<ApplicationEvent>{

	@Override
	public void onApplicationEvent(ApplicationEvent arg0) {
		System.out.println("Inside Cstarte Event Hndler" +arg0.getClass());
		
	}

}

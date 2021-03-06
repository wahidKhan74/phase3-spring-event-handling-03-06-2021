package com.simplilearn.webapp.beans;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomEventPublisher  implements ApplicationEventPublisherAware{

	private ApplicationEventPublisher publisher;
	
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}

	public void publish() {
		CutomEvent ce = new CutomEvent(this);
		publisher.publishEvent(ce);
	}
}

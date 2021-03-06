package com.simplilearn.webapp.beans;

import org.springframework.context.ApplicationEvent;

public class CutomEvent extends ApplicationEvent{
	
	public CutomEvent(Object source) {
		super(source);
	}
	
	public String toString() {
		return "This is a cutom event";
	}

}

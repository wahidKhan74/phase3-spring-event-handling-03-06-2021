package com.simplilearn.webapp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.simplilearn.webapp.beans.CustomEventPublisher;

@Controller
public class MainController {

	@RequestMapping(value="/cutomevent", method=RequestMethod.GET)
	public String cutomEvent(ModelMap map) {
		
		// Use application context
		ApplicationContext context = new ClassPathXmlApplicationContext("main-servlet.xml");
		
		CustomEventPublisher cep = (CustomEventPublisher) context.getBean("customEventPublisher");
		
		cep.publish();
		cep.publish();
		
		return "customEvent";
	}
}

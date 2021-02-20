package com.frank.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {

		// loading the Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from Spring container
		BasketballCoach basketballCoach = context.getBean("basketballCoach", BasketballCoach.class);

		// call methods on the bean
		System.out.println(basketballCoach.getDailyPractice());
		System.out.println(basketballCoach.getDailyFortune());

		// call methods to get literal values
		System.out.println(basketballCoach.getEmailAddress());
		System.out.println(basketballCoach.getTeam());

		// close the context
		context.close();
	}

}

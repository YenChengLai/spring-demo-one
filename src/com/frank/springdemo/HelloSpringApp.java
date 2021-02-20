package com.frank.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load Spring Contiguration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from Spring container
		Coach baseballCoach = context.getBean("myCoach", Coach.class);
		Coach volleyballCoach = context.getBean("volleyballCoach", Coach.class);

		// call methods on the bean
		System.out.println(baseballCoach.getDailyPractice());
		System.out.println(volleyballCoach.getDailyPractice());
		System.out.println(baseballCoach.getDailyFortune());
		System.out.println(volleyballCoach.getDailyFortune());

		// close the context
		context.close();
	}

}

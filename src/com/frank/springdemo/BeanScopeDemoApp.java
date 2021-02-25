package com.frank.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String args[]) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);

		Coach duplicateCoach = context.getBean("myCoach", Coach.class);

		// check if the coach object is the same
		System.out.println("memory location for theCoach: " + theCoach);
		System.out.println("memory location for duplicateCoach: " + duplicateCoach);
		System.out.println(theCoach == duplicateCoach);

		context.close();
	}

}

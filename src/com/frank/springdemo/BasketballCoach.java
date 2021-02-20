package com.frank.springdemo;

public class BasketballCoach implements Coach {

	private FortuneService fortuneSvc;

	// no-args constructor
	public BasketballCoach() {}

	// setter method for Spring setter injection
	public void setFortuneSvc(FortuneService fortuneSvc) {
		this.fortuneSvc = fortuneSvc;
	}

	@Override
	public String getDailyPractice() {
		return "dribble 30 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneSvc.getFortune();
	}

}

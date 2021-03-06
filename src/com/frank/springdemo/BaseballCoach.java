package com.frank.springdemo;

public class BaseballCoach implements Coach {

	// define a field for dependency
	private FortuneService fortuneSvc;

	// define a constructor for dependency injection
	public BaseballCoach(FortuneService fortuneSvc) {
		this.fortuneSvc = fortuneSvc;
	}

	public String getDailyPractice() {
		return "swing the bat 100 times";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneSvc.getFortune();
	}

}

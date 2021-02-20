package com.frank.springdemo;

public class VolleyballCoach implements Coach {

	// define a field for dependency
	private FortuneService fortuneSvc;

	// define a constructor for dependency injection
	public VolleyballCoach(FortuneService fortuneSvc) {
		this.fortuneSvc = fortuneSvc;
	}

	@Override
	public String getDailyPractice() {
		return "spike 100 times";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneSvc.getFortune();
	}

}

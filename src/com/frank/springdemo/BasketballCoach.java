package com.frank.springdemo;

public class BasketballCoach implements Coach {

	private FortuneService fortuneSvc;

	// add new fields for injecting literal values
	private String emailAddress;

	private String team;

	// no-args constructor
	public BasketballCoach() {
	}

	// setter method for Spring setter injection
	public void setFortuneSvc(FortuneService fortuneSvc) {
		this.fortuneSvc = fortuneSvc;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
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

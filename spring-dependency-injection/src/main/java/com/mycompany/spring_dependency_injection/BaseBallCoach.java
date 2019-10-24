package com.mycompany.spring_dependency_injection;

import lombok.Setter;

@Setter
public class BaseBallCoach implements Coach {
	private Fortune fortune;
	
	public String getDailyWorkout() {
		return "practice back volley today";
	}
	
	public String getDailyFortune() {
		return fortune.getFortune().toString();
	}
}

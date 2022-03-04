package com.demo.di;

public class Cricket_Coach implements Coach {
	
private Fortune fortune;


public Cricket_Coach(Fortune fortune) {
	super();
	this.fortune = fortune;
}

@Override
public String workout() {
	// TODO Auto-generated method stub
	return "daily one hour of running";
}

@Override
public String getDailyFortune() {
	// TODO Auto-generated method stub
	return fortune.fortuneService();
}



}

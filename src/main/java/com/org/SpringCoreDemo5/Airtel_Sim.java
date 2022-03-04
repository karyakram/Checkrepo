package com.org.SpringCoreDemo5;

public class Airtel_Sim implements Sim {

	public String calling() {
		return "welcome to airtel calling service.....!!";
	}
	
	public void doStartUp() {
		System.out.println("My Airtel Sim: StartUp- The init method");
	}
	
	public void doShutDown() {
		System.out.println("My Airtel Sim: Down- The destroy method");
	}

}

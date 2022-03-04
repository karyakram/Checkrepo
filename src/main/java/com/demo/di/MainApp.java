package com.demo.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ClassPathXmlApplicationContext appcon1= new ClassPathXmlApplicationContext("applicationContext.xml");
System.out.println("Loading");
Coach co = appcon1.getBean("mycoach",Coach.class);
System.out.println(co.getDailyFortune());
System.out.println(co.workout());
appcon1.close();
	}

}

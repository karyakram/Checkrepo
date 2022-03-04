package com.demo.setter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext appcon2=new ClassPathXmlApplicationContext("applicationContext.xml");
		UrbanClap uc =appcon2.getBean("neighhome",UrbanClap.class);
		System.out.println(uc.Cleaning());
		System.out.println(uc.Decorating());
		appcon2.close();
	}

}

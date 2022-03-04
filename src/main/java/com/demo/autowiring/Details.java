package com.demo.autowiring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Details {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext con= new AnnotationConfigApplicationContext(AppConfig.class);
		Company com = con.getBean(Company.class);
		com.showdepartmentInfo();
		con.close();

	}

}

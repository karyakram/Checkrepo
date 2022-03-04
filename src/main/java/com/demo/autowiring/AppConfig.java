package com.demo.autowiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.demo.autowiring")

public class AppConfig {
@Bean
public Department getDepartment() {
	return new DepartmentImp();
}
}

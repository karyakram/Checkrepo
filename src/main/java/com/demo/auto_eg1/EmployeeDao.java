package com.demo.auto_eg1;

import org.springframework.stereotype.Component;

@Component

public class EmployeeDao implements IDao {

	@Override
	public void result() {
		
		System.out.println("Employee Dao Implementation");
	}

}

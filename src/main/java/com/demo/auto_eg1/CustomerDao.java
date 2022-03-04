package com.demo.auto_eg1;

import org.springframework.stereotype.Component;

@Component
public class CustomerDao implements IDao {

	@Override
	public void result() {
		
		System.out.println("Customer Dao Implementation");
		
	}

}

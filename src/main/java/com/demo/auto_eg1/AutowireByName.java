package com.demo.auto_eg1;

import org.springframework.beans.factory.annotation.Autowired;

public class AutowireByName {

	@Autowired
	private IDao employeeDao;
	
	@Autowired
	private IDao customerDao;
	
	public void printResults() {
	    System.out.println("\n ------ Autowire By Name Results ------");
	    employeeDao.result();
	    customerDao.result();
	  }
}

package com.demo.aop;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class StudentAccountDao {
	
	public List findAcc(boolean obj) {
		if(obj) {
			throw new RuntimeException();
		}
		
		ArrayList<Account> myacc = new ArrayList<Account>();
		
		Account ac1= new Account("Messi","Abc123");
		Account ac2=new Account("Aguero","ab234");
		Account ac3=new Account("Silva","Ab454");
		
		
		myacc.add(ac1);myacc.add(ac2);myacc.add(ac3);
		
		return myacc;
	}

}

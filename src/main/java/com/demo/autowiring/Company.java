package com.demo.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Company {
	private Department dept;

	@Autowired
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	public void showdepartmentInfo() {
		dept.showDepartmentInfo();
	}

}

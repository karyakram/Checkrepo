package com.org.SpringCoreDemo5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.org.SpringCoreDemo.Sim;

public class App {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    ClassPathXmlApplicationContext appcon=new ClassPathXmlApplicationContext("applicationContext.xml");
    Sim s=appcon.getBean("mysim",Sim.class);
    System.out.println(s.calling());
    appcon.close();
  }
}

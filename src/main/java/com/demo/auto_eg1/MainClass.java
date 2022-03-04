package com.demo.auto_eg1;

public class MainClass {
    ApplicationContext ctxt = new AnnotationConfigApplicationContext(AppConfigForAutowired.class);
    
    AutowireByNameTestService abnts = ctxt.getBean(AutowireByNameTestService.class);
    abnts.printResults();
}

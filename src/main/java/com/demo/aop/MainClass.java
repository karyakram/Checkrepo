package com.demo.aop;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
 
public class MainClass {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
AnnotationConfigApplicationContext appcon = new AnnotationConfigApplicationContext(DemoAOP.class);
 
StudentAccountDao stu = appcon.getBean( StudentAccountDao.class);
StudentAccountDao1 stu1 = appcon.getBean( StudentAccountDao1.class);
stu1.newAccount();
 
List myacc = null ;
 try {
     boolean obj = true ;
     myacc = stu.findAcc(obj);
 }catch (Exception e) {
    // TODO: handle exception
     System.out.println("-----------------------");
     System.out.println("caugth the exception  : "+e);
}
 appcon.close();
    }
 
}
package com.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
 
@Aspect
@Component
public class AspectClass {
 
    @After(" execution(* com.org.aop..(..))")
    public void afterFindAccount(JoinPoint thejp) {
        String s = thejp.getSignature().toShortString();
        System.out.println(("execution the @After advice on the method : "+ s));
    }


    @AfterThrowing(pointcut = " execution(* com.org.aop..(..))" , throwing = "theException")
    public void afterThrowingFindAccount(JoinPoint joinPoint , Throwable theException) {
        String str = joinPoint.getSignature().toShortString();
        System.out.println(" \n Executing the @ afterThrowing on method "+ str);
        System.out.println(" The Excetion is : "+ theException);

    }
@Before("execution(public void newAccount())")
public void BeforeNewAccount() {
	System.out.println(" @Before advice - execution the @Before advice for new account ");
}
    
}

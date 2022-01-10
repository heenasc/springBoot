package com.upgrad;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext("com.upgrad");
        MathService mathService=(MathService) context.getBean("additionService");
        mathService.operate(5,6);
    }
}

package com.wisely.highlight_spring4.ch1.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UseFuncitonServcie useFunctionService = context.getBean(UseFuncitonServcie.class);
        System.out.println(useFunctionService.sayHello("Hello Word WEI"));

        context.close();
    }
}

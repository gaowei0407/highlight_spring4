package com.wisely.highlight_spring4.ch1.di.study;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig2.class);
        UseHelloService useHelloService = context.getBean(UseHelloService.class);
        System.out.println(useHelloService.sayHello("word GaoWei"));

        context.close();
    }
}

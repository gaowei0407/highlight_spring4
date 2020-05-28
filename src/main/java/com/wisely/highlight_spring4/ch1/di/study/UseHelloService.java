package com.wisely.highlight_spring4.ch1.di.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UseHelloService {

    @Autowired
    HelloService helloService;

    public String sayHello(String word){
        return helloService.sayHello(word);
    }
}

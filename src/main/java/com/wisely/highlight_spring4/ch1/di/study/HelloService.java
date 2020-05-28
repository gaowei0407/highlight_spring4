package com.wisely.highlight_spring4.ch1.di.study;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String sayHello(String word){
        return "Hello" + word + "!";
    }
}

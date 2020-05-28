package com.wisely.highlight_spring4.ch1.javaconfig;

public class UseFuncitonServcie {

    FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String sayHello(String word){
        return functionService.sayHello(word);
    }

}

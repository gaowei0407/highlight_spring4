package com.wisely.highlight_spring4.ch1.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public FunctionService functionService(){
        return new FunctionService();
    }

    @Bean
    public UseFuncitonServcie useFuncitonServcie(){
        UseFuncitonServcie useFuncitonServcie = new UseFuncitonServcie();
        useFuncitonServcie.setFunctionService(functionService());
        return useFuncitonServcie;
    }

    /*@Bean
    public UseFuncitonServcie useFuncitonServcie(FunctionService functionService){
        UseFuncitonServcie useFuncitonServcie = new UseFuncitonServcie();
        useFuncitonServcie.setFunctionService(functionService);
        return useFuncitonServcie;
    }*/
}

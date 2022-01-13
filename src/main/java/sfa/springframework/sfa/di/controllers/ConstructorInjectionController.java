package sfa.springframework.sfa.di.controllers;

import sfa.springframework.sfa.di.services.GreetingService;

public class ConstructorInjectionController {

    private final GreetingService greetingService;

    public ConstructorInjectionController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}

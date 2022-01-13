package sfa.springframework.sfa.di.controllers;

import sfa.springframework.sfa.di.services.GreetingService;

public class PropretyInjectionController {

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}

package sfa.springframework.sfa.di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import sfa.springframework.sfa.di.services.GreetingService;

@Controller
public class PropretyInjectionController {

    @Autowired
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}

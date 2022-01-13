package sfa.springframework.sfa.di.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hellow Dear !!");

        return "Hi Safae";
    }
}

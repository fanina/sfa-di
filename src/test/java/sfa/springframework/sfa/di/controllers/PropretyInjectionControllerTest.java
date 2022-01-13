package sfa.springframework.sfa.di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sfa.springframework.sfa.di.services.ConstructorGreetingService;

class PropretyInjectionControllerTest {

    PropretyInjectionController controller;

    @BeforeEach
    void setUp(){
         controller = new PropretyInjectionController();

         controller.greetingService = new ConstructorGreetingService();
    }
    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }

}
package sfa.springframework.sfa.di.controllers;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sfa.springframework.sfa.di.services.GreetingService;
import sfa.springframework.sfa.di.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class PropretyInjectionControllerTest {

    PropretyInjectionController controller;

    @BeforeEach
    void setUp(){
         controller = new PropretyInjectionController();

         controller.greetingService = new GreetingServiceImpl();
    }
    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }

}
package sfa.springframework.sfa.di.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {


    @Override
    public String sayGreeting() {
        return "Heloo World - Setter !!";
    }
}

package com.epizza.locking;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Initializer implements ApplicationRunner {

    private final PizzaService pizzaService;

    @Override
    public void run(ApplicationArguments args) {
        pizzaService.create();
    }
}

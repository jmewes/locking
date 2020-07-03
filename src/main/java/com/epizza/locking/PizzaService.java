package com.epizza.locking;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

@Service
@RequiredArgsConstructor
public class PizzaService {

    private final PizzaRepository pizzaRepository;

    public Pizza create() {
        return pizzaRepository.save(new Pizza("Vegetaria"));
    }

    @Transactional
    public Pizza get() {
        return pizzaRepository.getAll().findFirst().orElseThrow(() -> new EntityNotFoundException("No pizza available"));
    }
}

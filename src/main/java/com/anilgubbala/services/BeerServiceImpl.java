package com.anilgubbala.services;

import com.anilgubbala.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService{
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Goose Island")
                .beerStyle("Indian Pale Ale")
                .build();
    }
}

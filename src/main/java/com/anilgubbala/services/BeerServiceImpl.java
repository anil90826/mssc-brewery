package com.anilgubbala.services;

import com.anilgubbala.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService{
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Goose Island")
                .beerStyle("Indian Pale Ale")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {

        return BeerDto.builder().id(UUID.randomUUID())
                .beerStyle("LAGER")
                .beerName("Bud Light")
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        //TODO: ADD real code
    }

    @Override
    public void deleteBeerById(UUID beerId) {
        log.debug("Beer has been deleted");
    }
}

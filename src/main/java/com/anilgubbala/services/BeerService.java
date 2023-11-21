package com.anilgubbala.services;

import com.anilgubbala.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}

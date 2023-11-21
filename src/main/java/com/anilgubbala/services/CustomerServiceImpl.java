package com.anilgubbala.services;


import com.anilgubbala.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .customerId(UUID.randomUUID())
                .customerName("Anil Gubbala")
                .build();
    }

    @Override
    public CustomerDto createCustomer(CustomerDto customerDto) {

        return CustomerDto.builder()
                .customerName("Anil Gubbala")
                .customerId(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        //TODO:: implement actual updateCustomer
    }

    @Override
    public void deleteCustomerById(UUID customerId) {
        log.debug("Customer has been deleted");
    }
}

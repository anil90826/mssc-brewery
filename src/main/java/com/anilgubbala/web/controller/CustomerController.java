package com.anilgubbala.web.controller;

import com.anilgubbala.services.CustomerService;
import com.anilgubbala.web.model.CustomerDto;
import jakarta.validation.Valid;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/customers")
@RestController
@Validated
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customer/{customerId}")
    public ResponseEntity<CustomerDto> getCustomerById(@PathVariable("customerId") UUID customerId) {
        return new ResponseEntity<>(customerService.getCustomerById(customerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CustomerDto> handleCustomerCreate(@Valid @RequestBody CustomerDto customerDto) {
        CustomerDto saveCustomer = customerService.createCustomer(customerDto);
        HttpHeaders headers = new HttpHeaders();
        headers.set("Location", "/api/v1/customers/"+customerDto.getCustomerId().toString());
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }


    @PutMapping("/{customerId}")
    public ResponseEntity<CustomerDto> handleCustomerUpdate(@PathVariable("customerId") UUID customerId,@Valid @RequestBody CustomerDto customerDto) {
        customerService.updateCustomer(customerId, customerDto);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{customerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void handleCustomerDeleteById(@PathVariable("customerId") UUID customerId) {
        customerService.deleteCustomerById(customerId);
    }

}

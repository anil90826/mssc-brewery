package com.anilgubbala.web.mapper;

import com.anilgubbala.domain.Customer;
import com.anilgubbala.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    CustomerDto toCustomerDto(Customer customer);
    Customer toCustomer(CustomerDto customerDto);
}

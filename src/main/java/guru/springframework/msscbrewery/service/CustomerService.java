package guru.springframework.msscbrewery.service;

import guru.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
    CustomerDto addNewCustomer(CustomerDto customerDto);
    void updateById(UUID id, CustomerDto customerDto);
    void deleteById(UUID id);
}

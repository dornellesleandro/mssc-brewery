package guru.springframework.msscbrewery.service;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(customerId)
                .customerName("Serjão Berranteiro")
                .build();
    }

    @Override
    public CustomerDto addNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .customerName("Serjão Berranteiro")
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateById(UUID id, CustomerDto customerDto) {
        //todo add business log here
    }

    @Override
    public void deleteById(UUID id) {
        //todo add business log here
    }
}

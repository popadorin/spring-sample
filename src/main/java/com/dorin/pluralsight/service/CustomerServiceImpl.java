package com.dorin.pluralsight.service;

import com.dorin.pluralsight.model.Customer;
import com.dorin.pluralsight.repository.CustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerServiceImpl() {
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
}

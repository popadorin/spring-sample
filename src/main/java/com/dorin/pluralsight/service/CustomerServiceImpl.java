package com.dorin.pluralsight.service;

import com.dorin.pluralsight.model.Customer;
import com.dorin.pluralsight.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public CustomerServiceImpl() {
    }

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        System.out.println("using constructor injection!");
        this.customerRepository = customerRepository;
    }

}

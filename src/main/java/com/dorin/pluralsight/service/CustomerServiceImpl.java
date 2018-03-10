package com.dorin.pluralsight.service;

import com.dorin.pluralsight.model.Customer;
import com.dorin.pluralsight.repository.CustomerRepository;
import com.dorin.pluralsight.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}

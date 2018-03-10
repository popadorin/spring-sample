package com.dorin.pluralsight.repository;

import com.dorin.pluralsight.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();

        customer.setFirstName("Jora");
        customer.setLastName("Tufari");

        customers.add(customer);

        return customers;
    }
}

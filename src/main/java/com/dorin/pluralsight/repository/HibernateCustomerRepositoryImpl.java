package com.dorin.pluralsight.repository;

import com.dorin.pluralsight.model.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Value("${dbUsername}")
    private String dbUsername;

    @Override
    public List<Customer> findAll() {
        System.out.println("dbUsername: " + dbUsername);
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();

        customer.setFirstName("Jora");
        customer.setLastName("Tufari");

        customers.add(customer);

        return customers;
    }
}

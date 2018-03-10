package com.dorin.pluralsight.repository;

import com.dorin.pluralsight.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}

package com.dorin.pluralsight;

import com.dorin.pluralsight.repository.CustomerRepository;
import com.dorin.pluralsight.repository.HibernateCustomerRepositoryImpl;
import com.dorin.pluralsight.service.CustomerService;
import com.dorin.pluralsight.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "customerService")
    public CustomerService getCustomerService() {
        CustomerServiceImpl customerService = new CustomerServiceImpl(getCustomerRepository());

        return customerService;
    }

    @Bean(name = "customerRepository")
    public CustomerRepository getCustomerRepository() {
        return new HibernateCustomerRepositoryImpl();
    }
}

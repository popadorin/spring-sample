package com.dorin.pluralsight;

import com.dorin.pluralsight.repository.CustomerRepository;
import com.dorin.pluralsight.repository.HibernateCustomerRepositoryImpl;
import com.dorin.pluralsight.service.CustomerService;
import com.dorin.pluralsight.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.dorin.pluralsight"})
public class AppConfig {

    @Bean(name = "customerService")
    public CustomerService getCustomerService() {
//        CustomerServiceImpl customerService = new CustomerServiceImpl(getCustomerRepository());
        CustomerServiceImpl customerService = new CustomerServiceImpl();
//        customerService.setCustomerRepository(getCustomerRepository());

        return customerService;
    }

}

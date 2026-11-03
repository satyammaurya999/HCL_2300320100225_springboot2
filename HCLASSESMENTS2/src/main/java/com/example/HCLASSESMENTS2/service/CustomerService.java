package com.example.HCLASSESMENTS2.service;

import com.example.HCLASSESMENTS2.controller.CustomerManagement;
import com.example.HCLASSESMENTS2.entity.Customer;
import com.example.HCLASSESMENTS2.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerService {
    @Autowired
    private CustomerManagement customerManagement;
    @Autowired
    private CustomerRepo customerRepo;


    public void createCustomer(Customer customer) {
        customerRepo.save(customer);
    }
}

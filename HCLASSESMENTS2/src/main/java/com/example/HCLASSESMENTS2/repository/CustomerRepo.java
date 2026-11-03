package com.example.HCLASSESMENTS2.repository;

import com.example.HCLASSESMENTS2.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,Long > {
}

package com.codegym.cms.service;

import com.codegym.cms.model.Customer;
import com.codegym.cms.repository.ICustomerRepo;
import com.codegym.cms.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerServiceImpl implements ICustomerService{

    @Autowired
    private ICustomerRepo customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        customerRepository.remove(id);
    }
}
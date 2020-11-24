package com.codegym.cms.sevice;

import com.codegym.cms.Model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> listAllCustomer();

    Customer findByID(int id);

    void update(int id, Customer customer);

    void remove(int id);
}

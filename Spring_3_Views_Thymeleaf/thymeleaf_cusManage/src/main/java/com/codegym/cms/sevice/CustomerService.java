package com.codegym.cms.sevice;

import com.codegym.cms.Model.Customer;

import java.util.*;

public class CustomerService implements ICustomerService {
    private static Map<Integer,Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "John", "john@codegym.vn", "Hanoi"));
        customers.put(2, new Customer(2, "Bill", "bill@codegym.vn", "Danang"));
        customers.put(3, new Customer(3, "Alex", "alex@codegym.vn", "Saigon"));
        customers.put(4, new Customer(4, "Adam", "adam@codegym.vn", "Beijin"));
        customers.put(5, new Customer(5, "Sophia", "sophia@codegym.vn", "Miami"));
        customers.put(6, new Customer(6, "Rose", "rose@codegym.vn", "Newyork"));
    }
    public CustomerService() {
    }

    @Override
    public List<Customer> listAllCustomer() {
        Collection<Customer> values = customers.values();
        return new ArrayList<>(values);
    }

    @Override
    public Customer findByID(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {

    }

    @Override
    public void remove(int id) {

    }
}

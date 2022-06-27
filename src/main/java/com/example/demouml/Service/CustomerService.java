package com.example.demouml.Service;

import com.example.demouml.Entity.Customer;

import java.util.List;

public interface CustomerService {
    void deleteCustomerById(Long id);

    Customer updateCustomerById(Long id);

    List<Customer> showAllCustomers();

    Customer getCustomer(Long id);

    Customer addCustomer(Customer customer);
}

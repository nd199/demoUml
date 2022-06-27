package com.example.demouml.Service.Impl;

import com.example.demouml.Entity.Customer;
import com.example.demouml.Repository.CustomerRepository;
import com.example.demouml.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer getCustomer(Long id) {
        return customerRepository.findById(id).orElseThrow(() -> new RuntimeException("Admin Not found"));
    }

    @Override
    public List<Customer> showAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer updateCustomerById(Long id) {

        Customer customer = customerRepository.findById(id).orElseThrow(() -> new RuntimeException("Admin Not found"));
        if(customer!=null){
            customerRepository.save(customer);
        }
        return customer ;
    }

    @Override
    public void deleteCustomerById(Long id) {
        customerRepository.deleteById(id);
    }

}

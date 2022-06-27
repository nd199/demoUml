package com.example.demouml.Controller;

import com.example.demouml.Entity.Customer;
import com.example.demouml.Service.AdminService;
import com.example.demouml.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {


    @Autowired
    private CustomerService customerService;

    @PostMapping("/addCustomer")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){
        return new ResponseEntity<Customer>(customerService.addCustomer(customer), HttpStatus.OK);
    }

    @GetMapping("/getCustomer/{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable("id") Long id){
        return new ResponseEntity<Customer>(customerService.getCustomer(id), HttpStatus.FOUND);
    }

    @GetMapping("/showAllCustomers")
    public ResponseEntity<List<Customer>> showAllCustomers(){
        return new ResponseEntity<List<Customer>>(customerService.showAllCustomers(), HttpStatus.FOUND);
    }


    @PutMapping ("/updateCustomer/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable("id") Long id){
        return new ResponseEntity<Customer>(customerService.updateCustomerById(id), HttpStatus.OK);
    }

    @GetMapping("/deleteCustomer/{id}")
    public void deleteCustomer(@PathVariable("id") Long id){
        customerService.deleteCustomerById(id);
    }

}


package guru.springframework.springmvcrest.services;

import guru.springframework.springmvcrest.domain.Customer;

import java.util.List;

public interface CustomerService { // Alt + Enter, implement interface

    Customer findCustomerById(Long id); // method to find a customer by id

    List<Customer> findAllCustomers(); // find all customers, duh!

    Customer saveCustomer(Customer customer);

    void deleteCustomer(Long id);

}

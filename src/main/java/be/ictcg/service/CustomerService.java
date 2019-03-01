package be.ictcg.service;

import be.ictcg.model.Customer;

import java.sql.SQLException;
import java.util.List;

public interface CustomerService {

    void findCustomerById(int id);

    Customer saveCustomer(Customer customer);

    void createCustomer(int id, String firstName, String lastName, int age) throws SQLException;

    void updateCustomer(int id, String firstName, String lastName, int age) throws SQLException;

    void deleteCustomer(int id);

    List<Customer> getAllCustomers();
}

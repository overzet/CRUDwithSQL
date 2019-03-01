package be.ictcg.service;

import be.ictcg.dao.CustomerDao;
import be.ictcg.model.Customer;

import java.sql.SQLException;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private CustomerDao customerDao = new CustomerDao();

    @Override
    public void createCustomer(int id, String firstName, String lastName, int age) throws SQLException {
        customerDao.createCustomer(id,firstName,lastName,age);
    }

    @Override
    public void updateCustomer(int id, String firstName, String lastName, int age) throws SQLException {
        customerDao.updateCustomer(id, firstName, lastName, age);
    }

    @Override
    public void findCustomerById(int id) {
        customerDao.findCustomerById(id);
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return null;//customerDao.save(customer);
    }


    @Override
    public void deleteCustomer(int id) {
        customerDao.deleteById(id);
    }

    @Override
    public List<Customer> getAllCustomers() {
        List<Customer> customersList = customerDao.readCustomers();
        customersList.forEach(System.out::println);
        return customersList;
    }
}

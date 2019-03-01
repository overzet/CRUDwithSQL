package be.ictcg;

import be.ictcg.service.CustomerServiceImpl;

import java.sql.SQLException;

public class App {
    static final String JDBC_DRIVER = "org.h2.Driver";
    public static void main(String[] args) throws SQLException {

        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        CustomerServiceImpl service = new CustomerServiceImpl();
        service.getAllCustomers();

//        System.out.println("----------UPDATE------------");
//        try {
//            service.updateCustomer(102,"Wilhelmus", "Oranje", 48);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        System.out.println("----------------------");
//        service.getAllCustomers();

//        System.out.println("----------DELETE------------");
//            service.deleteCustomer(100);
//        service.getAllCustomers();
//        System.out.println("----------------------");


        System.out.println("----------READ------------");
        service.findCustomerById(101);
        service.getAllCustomers();
        System.out.println("----------------------");
    }
}

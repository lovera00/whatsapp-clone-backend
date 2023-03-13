package py.com.example.hexagonal.Customer.domain;

import java.util.List;

public interface CustomerRepository {

    public Customer createCustomer(String name, String country);

    public Customer getById(String customerId);

    public List<Customer> getAll();
    
}

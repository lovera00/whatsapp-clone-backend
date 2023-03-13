package py.com.example.hexagonal.Customer.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import py.com.example.hexagonal.Customer.domain.Customer;
import py.com.example.hexagonal.Customer.domain.CustomerRepository;
import py.com.example.hexagonal.Shared.domain.EntityRepository;

import java.util.List;
import java.util.UUID;

@Component
public class CustomerUseCase implements CustomerRepository {

    @Autowired
    EntityRepository entityRepository;

    @Override
    public Customer createCustomer(String name, String country) {
        Customer customer = Customer.builder()
            .id( UUID.randomUUID().toString() )
            .name( name )
            .country( country )
            .build();

        return entityRepository.save( customer );
    }

    @Override
    public Customer getById(String customerId) {
        return entityRepository.getById( customerId, Customer.class );
    }

    @Override
    public List<Customer> getAll() {
        return entityRepository.getAll( Customer.class );
    }
    
}

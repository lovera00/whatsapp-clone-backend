package py.com.example.hexagonal.Customer.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Customer {
    private String id;
    private String name;
    private String country;
}

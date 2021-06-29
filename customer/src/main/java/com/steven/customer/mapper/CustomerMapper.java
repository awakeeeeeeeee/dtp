package com.steven.customer.mapper;

import com.steven.customer.pojo.Customer;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerMapper {

    void save(Customer customer);


}

package com.steven.customer.mapper;

import com.steven.customer.pojo.Customer;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerMapper {

    void save(@Param("customer") Customer customer);


}

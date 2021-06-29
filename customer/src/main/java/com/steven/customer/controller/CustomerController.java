package com.steven.customer.controller;


import com.steven.customer.feign.OrderClient;
import com.steven.customer.mapper.CustomerMapper;
import com.steven.customer.pojo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private OrderClient orderClient;

    @ResponseBody
    @PostMapping("/registerCustomer")
    String registerCustomer(String userId,String name){

        Customer customer = new Customer();
        customer.setId(userId);
        customer.setName(name);
        customerMapper.save(customer);
        orderClient.addScore(userId);

        return "success";
    }
}

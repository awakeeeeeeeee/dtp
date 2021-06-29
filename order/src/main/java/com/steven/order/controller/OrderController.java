package com.steven.order.controller;


import com.steven.order.mapper.OrderMapper;
import com.steven.order.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderMapper orderMapper;

    @ResponseBody
    @PostMapping("/addScore")
    String addScore(String userId){

        Order order = orderMapper.selectOrder(userId);
        order.setScore(order.getScore().add(new BigDecimal(100)));

        orderMapper.updateScore(order);

        return "success";
    }
}

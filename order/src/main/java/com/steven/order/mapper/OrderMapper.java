package com.steven.order.mapper;

import com.steven.order.pojo.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMapper {


    Order selectOrder(String userId);

    void updateScore(Order order);

    void save(Order order);
}

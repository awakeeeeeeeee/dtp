package com.steven.order.mapper;

import com.steven.order.pojo.Orders;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMapper {


    Orders selectOrder(String userId);

    void updateScore(@Param("order")Orders order);

    void save(@Param("order") Orders order);
}

package com.steven.order.pojo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Order {

    private String userId;

    private BigDecimal score;

}

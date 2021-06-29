package com.steven.customer.feign.fallback;

import com.steven.customer.feign.OrderClient;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Service;

@Service
public class OrderClientFallBack implements FallbackFactory<OrderClient> {

    @Override
    public OrderClient create(Throwable cause) {

        return new OrderClient() {

            @Override
            public String addScore(String userId) {
                return "fail";
            }
        };
    }
}

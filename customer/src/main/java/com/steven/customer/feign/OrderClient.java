package com.steven.customer.feign;

import com.steven.customer.feign.fallback.OrderClientFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "order",fallbackFactory = OrderClientFallBack.class)
public interface OrderClient {

    @PostMapping("/addScore")
    String addScore(String userId);
}

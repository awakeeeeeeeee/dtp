package com.steven.customer.feign;

import com.steven.customer.feign.fallback.OrderClientFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "order",fallbackFactory = OrderClientFallBack.class)
public interface OrderClient {

    @PostMapping("/order/addScore")
    String addScore(@RequestParam("userId") String userId);
}

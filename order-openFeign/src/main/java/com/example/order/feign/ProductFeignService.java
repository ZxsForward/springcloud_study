package com.example.order.feign;

import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "product-service",path = "/product")
public interface ProductFeignService {

    @RequestLine("GET /{id}")
    String get(@Param("id") Integer id);
}
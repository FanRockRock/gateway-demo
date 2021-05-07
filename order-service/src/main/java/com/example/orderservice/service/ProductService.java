/*
 * ProductService.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.example.orderservice.service;

import com.example.orderservice.fallback.ProductServiceFallbackFactory;
import com.example.orderservice.pojo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 *
 * @author hanshu
 * @date 2021/4/1
 */
@FeignClient(value = "product-service", fallbackFactory = ProductServiceFallbackFactory.class)
public interface ProductService {
    @GetMapping("/product/{id}")
    Product selectProductById(@PathVariable("id") Integer id);
}

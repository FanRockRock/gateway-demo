/*
 * ProductServiceFallbackFactory.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.example.orderservice.fallback;

import com.example.orderservice.pojo.Product;
import com.example.orderservice.service.ProductService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 *
 *
 * @author hanshu
 * @date 2021/4/1
 */
@Component
public class ProductServiceFallbackFactory implements FallbackFactory<ProductService> {


    @Override
    public ProductService create(final Throwable throwable) {
        return new ProductService() {
            @Override
            public Product selectProductById(final Integer id) {
                return new Product(id, "托底数据", 2, 6666D);
            }
        };
    }
}

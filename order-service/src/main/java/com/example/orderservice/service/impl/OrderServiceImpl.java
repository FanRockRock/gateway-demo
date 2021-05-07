/*
 * OrderServiceImpl.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.example.orderservice.service.impl;

import com.example.orderservice.pojo.Order;
import com.example.orderservice.service.OrderService;
import com.example.orderservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 *
 *
 * @author hanshu
 * @date 2021/4/1
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private ProductService productService;
    @Override
    public Order selectOrderById(final Integer id) {
        return new Order(id,"order-001","中国",2666D,
                Arrays.asList(productService.selectProductById(1)));
    }
}

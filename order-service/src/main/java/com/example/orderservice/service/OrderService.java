/*
 * OrderService.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.example.orderservice.service;

import com.example.orderservice.pojo.Order;

/**
 *
 *
 * @author hanshu
 * @date 2021/4/1
 */
public interface OrderService {
    Order selectOrderById(Integer id);
}

/*
 * ProductService.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.example.productservice.service;

import com.example.productservice.pojo.Product;

/**
 *
 *
 * @author hanshu
 * @date 2021/4/1
 */
public interface ProductService {
    Product selectProductById(Integer id);
}

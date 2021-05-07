/*
 * ProductServiceImpl.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.example.productservice.service.impl;

import com.example.productservice.pojo.Product;
import com.example.productservice.service.ProductService;
import org.springframework.stereotype.Service;

/**
 *
 *
 * @author hanshu
 * @date 2021/4/1
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public Product selectProductById(final Integer id) {
        return new Product(id, "冰箱", 1, 2666D);
    }
}

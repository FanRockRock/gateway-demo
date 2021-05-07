/*
 * CustomGatewayFilter.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.example.gatewayserver.filter;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.core.Ordered;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * 自定义网关过滤器
 *
 * @author hanshu
 * @date 2021/4/21
 */
public class CustomGatewayFilter implements GatewayFilter, Ordered {
    @Override
    public Mono<Void> filter(final ServerWebExchange exchange, final GatewayFilterChain chain) {
        System.out.println("自定义网关过滤器被执行");
        return chain.filter(exchange);//继续往下执行
    }

    /**
    * 方法描述:执行顺序，数值越小优先级越高
    * @param
    * @return
    */
    @Override
    public int getOrder() {
        return 0;
    }
}

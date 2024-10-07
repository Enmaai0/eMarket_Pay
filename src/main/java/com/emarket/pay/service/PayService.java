package com.emarket.pay.service;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
@Component
public interface PayService {
    void create(String orderId, BigDecimal amount);
}

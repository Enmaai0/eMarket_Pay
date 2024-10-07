package com.emarket.pay.service.impl;

import com.emarket.pay.PayApplicationTests;
import com.emarket.pay.service.PayService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

public class PayServiceImlTest extends PayApplicationTests {
    @Autowired
    private PayService payService;
    @Test
    public void create() {
        payService.create("lyuzexyyki", BigDecimal.valueOf(0.01));
    }
}
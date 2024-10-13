package com.emarket.pay.service;

import com.lly835.bestpay.model.PayResponse;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
@Component
public interface PayService {
    PayResponse create(String orderId, BigDecimal amount);

    String asyncNotify(String notifyData);
}

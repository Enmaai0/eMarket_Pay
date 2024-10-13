package com.emarket.pay.service.impl;

import com.emarket.pay.service.PayService;
import com.lly835.bestpay.enums.BestPayTypeEnum;
import com.lly835.bestpay.model.PayRequest;
import com.lly835.bestpay.model.PayResponse;
import com.lly835.bestpay.service.BestPayService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
@Slf4j
@Service
public class PayServiceIml implements PayService {
    @Autowired
    private BestPayService bestPayService;
    @Override
    public PayResponse create(String orderId, BigDecimal amount) {
        PayRequest payRequest = new PayRequest();
        payRequest.setOrderName("eMarket WeChat Order");
        payRequest.setOrderId(orderId);
        payRequest.setOrderAmount(amount.doubleValue());
        payRequest.setPayTypeEnum(BestPayTypeEnum.WXPAY_NATIVE);

        PayResponse payResponse = bestPayService.pay(payRequest);
        log.info("payResponse={}", payResponse);
        return payResponse;
    }
    @Override
    public String asyncNotify(String notifyData) {
        PayResponse payResponse = bestPayService.asyncNotify(notifyData);
        log.info("payResponse={}", payResponse);
        return "{\"code\":\"SUCCESS\",\"msg\":\"成功\"}";
    }
}

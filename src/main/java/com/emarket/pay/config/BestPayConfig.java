package com.emarket.pay.config;

import com.lly835.bestpay.config.WxPayConfig;
import com.lly835.bestpay.service.BestPayService;
import com.lly835.bestpay.service.impl.BestPayServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BestPayConfig {
    @Bean   // execute when the application starts
    public BestPayService bestPayService() {
        WxPayConfig wxPayConfig = new WxPayConfig();
        wxPayConfig.setAppId("wx3e6b9f1c5a7ff034");
        wxPayConfig.setMchId("1614433647");
        wxPayConfig.setMchKey("Aa111111111122222222223333333333");
        wxPayConfig.setNotifyUrl("http://47.92.2.20:8080/pay/notify");

        BestPayServiceImpl bestPayService = new BestPayServiceImpl();
        bestPayService.setWxPayConfig(wxPayConfig);
        return bestPayService;
    }
}

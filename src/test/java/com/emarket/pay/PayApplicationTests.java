package com.emarket.pay;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class PayApplicationTests extends PayApplication {
    @Autowired
    private AmqpTemplate amqpTemplate;

    @Test
    public void contextLoads() {
    }

    @Test
    public void send() {
        amqpTemplate.convertAndSend("payNotify", "hello");
    }

}

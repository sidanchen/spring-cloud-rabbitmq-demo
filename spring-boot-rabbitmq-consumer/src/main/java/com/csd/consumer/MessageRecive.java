package com.csd.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageRecive {

    @RabbitListener(queues = "direct_queue")
    public void revice(String str){
        System.out.println(str);
    }
}

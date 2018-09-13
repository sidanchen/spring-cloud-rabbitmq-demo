package com.csd.queue.send;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageSend {
    @Autowired
    private AmqpTemplate amqpTemplate;


    public void sendMessage(){
        amqpTemplate.convertAndSend("direct_queue","hello rabbitmq(direct)");
    }
}

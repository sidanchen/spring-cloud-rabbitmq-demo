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

    public void sendTopicMessage(String bindKey){
        amqpTemplate.convertAndSend("amq.topic",bindKey,"hello RabbitMQ(topicExchange),bindKey:"+bindKey);
    }

    public void sendFanoutMessage(){
        amqpTemplate.convertAndSend("fanoutExchange","","hello RabbitMQ(fanoutExchange)");
    }
}

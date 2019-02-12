package com.csd.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageRecive {

    @RabbitListener(queues = "direct_queue")
    public void revice(String str){
        System.out.println(str);
    }

    @RabbitListener(queues = "topic_queue1")
    public void topicMessageRevice1(String str){
        System.out.println(str);
    }

    @RabbitListener(queues = "topic_queue2")
    public void topicMessageRevice2(String str){
        System.out.println(str);
    }

    @RabbitListener(queues = "fanout_queue1")
    public void fanoutMessageRevice1(String str){
        System.out.println(str);
    }

    @RabbitListener(queues = "fanout_queue2")
    public void fanoutMessageRevice2(String str){
        System.out.println(str);
    }

    @RabbitListener(queues = "fanout_queue3")
    public void fanoutMessageRevice3(String str){
        System.out.println(str);
    }
}
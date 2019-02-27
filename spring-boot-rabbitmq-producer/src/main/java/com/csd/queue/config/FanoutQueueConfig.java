package com.csd.queue.config;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * 添加注释111
 */
@Configuration
public class FanoutQueueConfig {

    @Bean(name =  "fanout_queue1")
    public Queue queue1(){
        return new Queue("fanout_queue1");
    }

    @Bean(name = "fanout_queue2")
    public Queue queue2(){
        return new Queue("fanout_queue2");
    }

    @Bean(name  = "fanout_queue3")
    public Queue queue3(){
        return new Queue("fanout_queue3");
    }

    @Bean
    public FanoutExchange fanoutExchange(){
        return new FanoutExchange("amq.fanout");
    }

    @Bean
    public Binding bindingFanoutQueue1(@Qualifier("fanout_queue1") Queue queue,FanoutExchange fanoutExchange){
        return BindingBuilder.bind(queue).to(fanoutExchange);
    }

    @Bean
    public Binding bindingFanoutQueue2(@Qualifier("fanout_queue2") Queue queue,FanoutExchange fanoutExchange){
        return BindingBuilder.bind(queue).to(fanoutExchange);
    }

    @Bean
    public Binding bindingFanoutQueue3(@Qualifier("fanout_queue3") Queue queue,FanoutExchange fanoutExchange){
        return BindingBuilder.bind(queue).to(fanoutExchange);
    }
}

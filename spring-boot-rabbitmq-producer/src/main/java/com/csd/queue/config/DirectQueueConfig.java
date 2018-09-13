package com.csd.queue.config;


import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DirectQueueConfig {

    @Bean(name="direct_queue")
    public Queue queue(){
        return new Queue("direct_queue");
    }
}

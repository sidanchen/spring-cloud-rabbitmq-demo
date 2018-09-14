package com.csd.queue.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TopicQueueConfig {

    @Bean(name = "topic_queue1")
    public Queue queue(){
        return new Queue("topic_queue1");
    }

    @Bean(name = "topic_queue2")
    public Queue queue1(){
        return new Queue("topic_queue2");
    }


    @Bean
    public TopicExchange topicExchange(){
        return new TopicExchange("exchanage");
    }

    @Bean
    public Binding bindingTopicQueue1(@Qualifier("topic_queue1") Queue queue,TopicExchange topicExchange){
        return BindingBuilder.bind(queue).to(topicExchange).with("topic.message");
    }

    @Bean
    public Binding bindingTopicQueue2(@Qualifier("topic_queue2") Queue queue,TopicExchange topicExchange){
        return BindingBuilder.bind(queue).to(topicExchange).with(("topic.*"));
    }


}

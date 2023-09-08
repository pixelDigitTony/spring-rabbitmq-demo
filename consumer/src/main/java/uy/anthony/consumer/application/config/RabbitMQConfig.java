package uy.anthony.consumer.application.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    @Bean
    public DirectExchange directExchange() {
        return new DirectExchange("amq.direct");
    }

    @Bean
    public Queue myQueue() {
        return new Queue("consumer1");
    }

    @Bean
    public Queue myQueue2() {
        return new Queue("consumer2");
    }

    @Bean
    public Binding binding(Queue myQueue, DirectExchange directExchange) {
        return BindingBuilder.bind(myQueue)
                .to(directExchange)
                .with("302dc5b2-3670-4df3-a40d-d285ed7da172");
    }

    @Bean
    public Binding binding2(Queue myQueue2, DirectExchange directExchange) {
        return BindingBuilder.bind(myQueue2)
                .to(directExchange)
                .with("bc1457eb-799e-4564-9622-152af927a0cd");
    }
}

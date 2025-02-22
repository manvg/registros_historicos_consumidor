package com.microservicio.registros_historicos_consumidor.config;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Value;
@Configuration
public class RabbitMQConfig {

    @Value("${rabbitmq.queue.registros_historicos}")
    private String alertasCriticasQueue;

    @Bean
    public Queue alertasCriticasQueue() {
        return new Queue(alertasCriticasQueue, true);
    }

    @Bean
    public Jackson2JsonMessageConverter jsonMessageConverter() {
        return new Jackson2JsonMessageConverter();
    }
}

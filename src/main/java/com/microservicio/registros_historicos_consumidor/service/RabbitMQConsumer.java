package com.microservicio.registros_historicos_consumidor.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.microservicio.registros_historicos_consumidor.model.SignosVitales;

@Service
public class RabbitMQConsumer {

    private final RegistroHistoricoService registroHistoricoService;

    public RabbitMQConsumer(RegistroHistoricoService registroHistoricoService) {
        this.registroHistoricoService = registroHistoricoService;
    }

    @RabbitListener(queues = "${rabbitmq.queue.registros_historicos}")
    public void recibirAlerta(SignosVitales signos) {
        System.out.println("RabbitMQ =>Registro histórico=> signos vitáles de " + signos.getNombrePaciente());
        registroHistoricoService.guardarSignosVitales(signos);
        System.out.println("RabbitMQ =>Registro histórico=> signos vitáles almacenados con éxito en base de datos!.");
    }
}

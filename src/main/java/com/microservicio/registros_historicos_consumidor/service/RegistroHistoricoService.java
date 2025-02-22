package com.microservicio.registros_historicos_consumidor.service;

import org.springframework.stereotype.Service;

import com.microservicio.registros_historicos_consumidor.model.AlertaMedica;
import com.microservicio.registros_historicos_consumidor.model.SignosVitales;
import com.microservicio.registros_historicos_consumidor.model.SignosVitalesPacienteEntity;
import com.microservicio.registros_historicos_consumidor.repository.RegistroHistoricoRepository;


@Service
public class RegistroHistoricoService {

    private final RegistroHistoricoRepository registroHistoricoRepository;

    public RegistroHistoricoService(RegistroHistoricoRepository registroHistoricoRepository) {
        this.registroHistoricoRepository = registroHistoricoRepository;
    }

    public void guardarSignosVitales(SignosVitales signos) {
        SignosVitalesPacienteEntity signosVitales = new SignosVitalesPacienteEntity();
        signosVitales.setNombrePaciente(signos.getNombrePaciente());
        signosVitales.setRitmoCardiaco(signos.getRitmoCardiaco());
        signosVitales.setTemperatura(signos.getTemperatura());
        signosVitales.setPresionSistolica(signos.getPresionSistolica());
        signosVitales.setPresionDiastolica(signos.getPresionDiastolica());

        registroHistoricoRepository.save(signosVitales);
        System.out.println("RegistroHistoricoService => OK datos de : " + signos.getNombrePaciente());
    }
}
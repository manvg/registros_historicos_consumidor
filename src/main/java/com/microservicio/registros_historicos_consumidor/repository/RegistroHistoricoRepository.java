package com.microservicio.registros_historicos_consumidor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservicio.registros_historicos_consumidor.model.SignosVitalesPacienteEntity;

@Repository
public interface RegistroHistoricoRepository extends JpaRepository<SignosVitalesPacienteEntity, Integer> {
    
}

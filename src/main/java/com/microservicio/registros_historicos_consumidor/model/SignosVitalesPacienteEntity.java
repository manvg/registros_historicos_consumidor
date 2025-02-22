package com.microservicio.registros_historicos_consumidor.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "signos_vitales_paciente")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignosVitalesPacienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_signo_vital_paciente")
    private int idSignoVital;

    @Column(name = "nombre_paciente", nullable = false, length = 100)
    private String nombrePaciente;

    @Column(name = "ritmo_cardiaco", nullable = false)
    private int ritmoCardiaco;

    @Column(name = "temperatura", nullable = false, precision = 5)
    private double temperatura;

    @Column(name = "presion_sistolica", nullable = false)
    private int presionSistolica;

    @Column(name = "presion_diastolica", nullable = false)
    private int presionDiastolica;
}

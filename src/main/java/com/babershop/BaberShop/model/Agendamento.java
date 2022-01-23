package com.babershop.BaberShop.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
public class Agendamento {

    //teste
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @ManyToOne
    private Cliente cliente;
    
    @ManyToOne
    private Corte corte;

    @CreationTimestamp
    private LocalDateTime dataDoAgentamento;
    bla2
    private LocalDateTime horaMarcada;
    //td(name: teste UPDATE!!!!;)
    //td(name: teste 2;)





}

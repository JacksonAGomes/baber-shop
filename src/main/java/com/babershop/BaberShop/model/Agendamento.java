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

    private LocalDateTime horaMarcada;
    //td(name: TD 4;)
    //td(name: TD 5;)


    //td(name: TD 4;)
    //td(name: TD 5;)


}

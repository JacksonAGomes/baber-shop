package com.babershop.BaberShop.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Data
@Entity
public class Corte {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String nome;
    private BigDecimal valor;
    //td(name: td 1 UPDATE;)
    //td(name: td 2 UPDATE;)
    //td(name: td 3 UPDATE;)

    //td(name: td 2;)

    //td(name: td 1 UPDATED;)



}

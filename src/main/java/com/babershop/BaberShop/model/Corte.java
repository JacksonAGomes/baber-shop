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
        bla
    //td(name: td 1 ;)
    blabla


    //td(name: td 3 ;)

    //td(name: outra td diferente ;)



}

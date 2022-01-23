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

    //td(name: TD 9 ;)
    //td(name: TD 1 outroArquivo.java UPDATED;)
    //td(name: TD 2 ;)
    //td(name: TD 1 ;)
    //td(name: TD 2 ;)
    //td(name: TD 3 UPDATED;)
    blabla




}

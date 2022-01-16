package com.babershop.BaberShop.model;

import javax.persistence.*;

@Entity
public class Cliente {


    // td(name: faltam testes ;)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String nome;
    //td(name: bujiganga ;)
    private String telefone;
}
package com.babershop.BaberShop.model;

import javax.persistence.*;

@Entity
public class Cliente {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String nome;

    private String telefone;
}
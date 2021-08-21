package com.babershop.BaberShop.service;

import com.babershop.BaberShop.repository.CorteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CorteService {

    @Autowired
    private CorteRepository corteRepository;
}

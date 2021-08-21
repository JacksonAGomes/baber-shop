package com.babershop.BaberShop.controller;

import com.babershop.BaberShop.service.CorteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cortes")
public class CorteController {

    @Autowired
    private CorteService corteService;
}

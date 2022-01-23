package com.babershop.BaberShop.service;

import com.babershop.BaberShop.exception.EntityNotFoundException;
import com.babershop.BaberShop.model.Corte;
import com.babershop.BaberShop.repository.CorteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CorteService {

    @Autowired
    private CorteRepository corteRepository;

    public Corte salvar(Corte corte){
        return corteRepository.save(corte);
    }

    public List<Corte> listar(){
        return corteRepository.findAll();
    }

    public Corte buscar(Long corteId){
        return corteRepository.findById(corteId).orElseThrow(EntityNotFoundException::new);
    }

    public void deletar(Long corteId){
        Corte corte = this.buscar(corteId);
        corteRepository.delete(corte);
    }
    blabl
    //td(name: divida ;)
    bla
}

package com.babershop.BaberShop.controller;

import com.babershop.BaberShop.exception.EntityNotFoundException;
import com.babershop.BaberShop.model.Corte;
import com.babershop.BaberShop.service.CorteService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cortes")
public class CorteController {

    @Autowired
    private CorteService corteService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Corte salvar(@RequestBody Corte corte){
        return corteService.salvar(corte);
    }

    @GetMapping
    public List<Corte> listar(){
        return corteService.listar();
    }

    @GetMapping("/{corteId}")
    public ResponseEntity<Corte> buscar(@PathVariable Long corteId){
        try{
            Corte corte = corteService.buscar(corteId);
            return ResponseEntity.ok(corte);
        }catch (EntityNotFoundException e){
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{corteId}")
    public ResponseEntity<Corte> atualizar(@PathVariable Long corteId, @RequestBody Corte corte){
        try {
            Corte corteAtual = corteService.buscar(corteId);
            BeanUtils.copyProperties(corte, corteAtual, "id");
            return ResponseEntity.ok(corteAtual);
        }catch (EntityNotFoundException e){
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{corteId}")
    public ResponseEntity<?> deletar(@PathVariable Long corteId){
        try{
            corteService.deletar(corteId);
            return ResponseEntity.noContent().build();

        }catch (EntityNotFoundException e){
            return ResponseEntity.notFound().build();
        }catch (DataIntegrityViolationException e){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("entity in use, cannot delete ");
        }
    }
    //td(name: TD A3;)
    //td(name: TD B;)

    //td(name: AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA;)


}

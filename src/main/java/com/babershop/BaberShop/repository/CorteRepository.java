package com.babershop.BaberShop.repository;

import com.babershop.BaberShop.model.Corte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CorteRepository extends JpaRepository<Corte, Long>, JpaSpecificationExecutor<Corte> {
}

package com.example.msbanque2.repositories;

import com.example.msbanque2.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte,Long> {
}

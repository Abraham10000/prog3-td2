package com.example.prog3td2.td2.repository;

import com.example.prog3td2.td2.model.MatchEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<MatchEntity , String> {
}

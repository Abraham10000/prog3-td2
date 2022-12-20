package com.example.prog3td2.td2.repository;

import com.example.prog3td2.td2.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, String> {
}

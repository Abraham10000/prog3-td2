package com.example.prog3td2.td2.repository;

import com.example.prog3td2.td2.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TeamRepository extends JpaRepository<Team, String> {

    @Query(value = "select * from team t inner join player p on p.id_player = t.id_player" +
            "inner join sponsor s on s.id_spons = t.id_spons" +
            "order by p.number asc",nativeQuery = true)
    List<Team> findAll();
}

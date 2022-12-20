package com.example.prog3td2.td2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "team")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    @OneToMany
    @JoinColumn(name = "id_player")
    private List<Player> players;

    @ManyToMany
    @JoinTable(
        name = "have_sponsor",
        joinColumns = @JoinColumn(name = "id_team"),
        inverseJoinColumns = @JoinColumn(name = "id_spons")
    )
    List<Sponsor> sponsor;
}

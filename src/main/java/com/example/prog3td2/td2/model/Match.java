package com.example.prog3td2.td2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "match")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_match;

    @ManyToOne
    @JoinColumn(name = "id_team_home")
    private Team team_home;

    @ManyToOne
    @JoinColumn(name = "id_team_away")
    private Team team_away;

    private Date datetime;
    private String stadium;
}

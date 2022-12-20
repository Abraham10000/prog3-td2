package com.example.prog3td2.td2.controller.response;

import com.example.prog3td2.td2.model.Player;
import com.example.prog3td2.td2.model.Sponsor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Data
@Builder
public class CreateTeamResponse {
    private String name;
    private List<Player> players;
    private List<Sponsor> sponsors;
}

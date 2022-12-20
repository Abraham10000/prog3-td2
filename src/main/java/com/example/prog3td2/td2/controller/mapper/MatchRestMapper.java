package com.example.prog3td2.td2.controller.mapper;

import com.example.prog3td2.td2.controller.response.MatchResponse;
import com.example.prog3td2.td2.controller.response.TeamResponse;
import com.example.prog3td2.td2.model.Match;
import com.example.prog3td2.td2.service.MatchService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class MatchRestMapper {
    private final MatchService service;

    public MatchResponse toRest(Match domain){
        return MatchResponse.builder()
                .match_id(domain.getId_match())
                .team_away(domain.getTeam_away().getName())
                .team_home(domain.getTeam_home().getName())
                .datetime(domain.getDatetime())
                .build();
    }
}

package com.example.prog3td2.td2.controller.mapper;
import com.example.prog3td2.td2.controller.response.CreateTeamResponse;
import com.example.prog3td2.td2.controller.response.TeamResponse;
import com.example.prog3td2.td2.controller.response.UpdateTeamResponse;
import com.example.prog3td2.td2.model.Team;
import com.example.prog3td2.td2.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class TeamRestMapper {
    private final TeamService service;
    public TeamResponse toRest(Team domain){
        return TeamResponse.builder()
                .name(domain.getName())
                .players(domain.getPlayers())
                .sponsors(domain.getSponsor())
                .build();
    }

    public Team toDomain(CreateTeamResponse rest){
        return Team.builder()
                .name(rest.getName())
                .players(rest.getPlayers())
                .sponsor(rest.getSponsors())
                .build();
    }

    public Team toUpdate(UpdateTeamResponse rest){
        Team toUp = service.findById(rest.getId());
        toUp.setId(rest.getId());
        toUp.setName(rest.getName());
        return toUp;
    }
}

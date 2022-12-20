package com.example.prog3td2.td2.controller;

import com.example.prog3td2.td2.controller.mapper.TeamRestMapper;
import com.example.prog3td2.td2.controller.response.CreateTeamResponse;
import com.example.prog3td2.td2.controller.response.TeamResponse;
import com.example.prog3td2.td2.controller.response.UpdateTeamResponse;
import com.example.prog3td2.td2.model.Team;
import com.example.prog3td2.td2.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class TeamController {
    private final TeamService service;
    private final TeamRestMapper mapper;

    @GetMapping("/teams")
    public List<TeamResponse> getTeam(){
        return service.getALl().stream()
                .map(mapper::toRest)
                .toList();
    }

    @PostMapping("/teams")
    public List<TeamResponse> addTeam(@RequestBody List<CreateTeamResponse> toAdd){
        List<Team> domain = toAdd.stream()
                .map(mapper::toDomain)
                .toList();
        return service.addTeam(domain).stream()
                .map(mapper::toRest)
                .toList();
    }

    @PutMapping("/teams")
    public List<TeamResponse> updateTeam(@RequestBody List<UpdateTeamResponse> toUpdate){
        List<Team> domain = toUpdate.stream()
                .map(mapper::toUpdate)
                .toList();
        return service.addTeam(domain).stream()
                .map(mapper::toRest)
                .toList();
    }
}

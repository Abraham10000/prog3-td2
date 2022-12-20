package com.example.prog3td2.td2.service;

import com.example.prog3td2.td2.model.Team;
import com.example.prog3td2.td2.repository.TeamRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TeamService {
    private final TeamRepository teamRepository;
    public List<Team> getALl(){return teamRepository.findAll();}

    public List<Team> addTeam(List<Team> toCreate){return teamRepository.saveAll(toCreate);}

    public List<Team> updateTeam(List<Team> toupdate){return teamRepository.saveAll(toupdate);}

    public Team findById(int id){
        Optional<Team> optional = teamRepository.findById(String.valueOf(id));

        if (optional.isPresent()) {
            return optional.get();
        } else{
            throw new NullPointerException("Author not found");
        }
    }
}

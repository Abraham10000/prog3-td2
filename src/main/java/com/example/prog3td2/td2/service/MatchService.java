package com.example.prog3td2.td2.service;

import com.example.prog3td2.td2.model.Match;
import com.example.prog3td2.td2.repository.MatchRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MatchService {
    private final MatchRepository repository;

    public List<Match> getALl(){return repository.findAll();}

    public List<Match> addMatch(List<Match> toAdd){return repository.saveAll(toAdd);}

    public List<Match> updateMatch(List<Match> toUp){return repository.saveAll(toUp);}


}

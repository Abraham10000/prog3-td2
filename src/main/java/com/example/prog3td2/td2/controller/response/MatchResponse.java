package com.example.prog3td2.td2.controller.response;

import com.example.prog3td2.td2.model.Team;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class MatchResponse {
    private int match_id;
    private String team_away;
    private String team_home;
    private Date datetime;
}

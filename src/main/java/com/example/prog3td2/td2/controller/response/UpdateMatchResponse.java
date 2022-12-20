package com.example.prog3td2.td2.controller.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@AllArgsConstructor
@Data
@Builder
public class UpdateMatchResponse {
    private int id;
    private String team_home;
    private String team_away;
    private Date datetime;
}

package com.example.prog3td2.td2.controller.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@AllArgsConstructor
@Data
@Builder
public class CreateMatchResponse {
    private int id;
    private String team_away;
    private String team_home;
    private Date datetime;
    private String stadium;
}

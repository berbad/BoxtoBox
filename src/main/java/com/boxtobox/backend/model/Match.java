package com.boxtobox.backend.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "matches")
public class Match {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @ManyToOne
  @JoinColumn(name = "home_team_id")
  private Team homeTeam;
  @ManyToOne
  @JoinColumn(name = "away_team_id")
  private Team awayTeam;
  private LocalDateTime matchDate;
  private String stadium;
  private Integer homeScore;
  private Integer awayScore;
  private String status;
  private Integer apiId;
  private Integer matchweek;
}
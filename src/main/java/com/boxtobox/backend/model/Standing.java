package com.boxtobox.backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "standings")
public class Standing {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "team_id")
  private Team team;

  private Integer position;
  private Integer played;
  private Integer wins;
  private Integer draws;
  private Integer losses;
  private Integer goalsFor;
  private Integer goalsAgainst;
  private Integer goalDifference;
  private Integer points;
}
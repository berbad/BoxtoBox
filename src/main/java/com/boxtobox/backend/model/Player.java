package com.boxtobox.backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "players")
public class Player {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "team_id")
  private Team team;

  private String name;
  private String position;
  private String nationality;
  private Integer height;
  private Integer weight;
  private Integer goals;
  private Integer assists;
  private Integer yellowCards;
  private Integer redCards;
  private Double xG;
  private Integer appearances;
  private Long apiId;
}
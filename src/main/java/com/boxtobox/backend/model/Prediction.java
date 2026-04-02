package com.boxtobox.backend.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "predictions")
public class Prediction {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "match_id")
  private Match match;

  private Double homeWinProbability;
  private Double drawProbability;
  private Double awayWinProbability;
  private String predictedWinner;
  private LocalDateTime createdAt;
}
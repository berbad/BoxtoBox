package com.boxtobox.backend.service;

import com.boxtobox.backend.model.Prediction;
import com.boxtobox.backend.repository.PredictionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PredictionService {

  private final PredictionRepository predictionRepository;

  public List<Prediction> getAllPredictions() {
    return predictionRepository.findAll();
  }

  public Prediction getPredictionById(Long id) {
    return predictionRepository.findById(id).orElseThrow();
  }

  public Prediction savePrediction(Prediction prediction) {
    return predictionRepository.save(prediction);
  }
}

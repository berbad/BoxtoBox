package com.boxtobox.backend.service;

import com.boxtobox.backend.model.Match;
import com.boxtobox.backend.repository.MatchRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MatchService {

  private final MatchRepository matchRepository;

  public List<Match> getAllMatches() {
    return matchRepository.findAll();
  }

  public Match getMatchById(Long id) {
    return matchRepository.findById(id).orElseThrow();
  }

  public Match saveMatch(Match match) {
    return matchRepository.save(match);
  }
}
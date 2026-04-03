package com.boxtobox.backend.service;

import com.boxtobox.backend.model.Team;
import com.boxtobox.backend.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeamService {

  private final TeamRepository teamRepository;

  public List<Team> getAllTeams() {
    return teamRepository.findAll();
  }

  public Team getTeamById(Long id) {
    return teamRepository.findById(id).orElseThrow();
  }

  public Team saveTeam(Team team) {
    return teamRepository.save(team);
  }
}
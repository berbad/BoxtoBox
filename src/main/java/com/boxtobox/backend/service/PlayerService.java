package com.boxtobox.backend.service;

import com.boxtobox.backend.model.Player;
import com.boxtobox.backend.repository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayerService {
  private final PlayerRepository playerRepository;

  public List<Player> getAllPlayers() {
    return playerRepository.findAll();
  }

  public Player getPlayerById(Long id) {
    return playerRepository.findById(id).orElseThrow();
  }

  public Player savePlayer(Player player) {
    return playerRepository.save(player);
  }
}

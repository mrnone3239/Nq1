// PlayerRepository.java
package com.example.player;

import java.util.*;

public interface PlayerRepository {
    List<Player> getAllPlayers();

    Player getPlayerById(int playerId);

    void addPlayer(Player player);

    void updatePlayer(Player player);

    void deletePlayer(int playerId);
}
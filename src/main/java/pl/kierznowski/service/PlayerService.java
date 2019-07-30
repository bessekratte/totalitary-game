package pl.kierznowski.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.kierznowski.data.Player;
import pl.kierznowski.repository.PlayerRepository;

@Service("userService")
public class PlayerService {

    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository players) {
        this.playerRepository = players;
    }

    public Player findById(int id){
        throw new RuntimeException("Not implemented yet");
    }

    public void add(Player player) {
        playerRepository.add(player);
    }
}
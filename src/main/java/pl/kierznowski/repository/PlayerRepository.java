package pl.kierznowski.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.kierznowski.data.Player;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PlayerRepository {

    private final List<Player> players = new ArrayList<>();

    @Autowired
    public PlayerRepository() {
        super();
    }

    public void add(Player player){
        players.add(player);
    }
}

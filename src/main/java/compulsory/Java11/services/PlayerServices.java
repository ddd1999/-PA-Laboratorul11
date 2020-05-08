package compulsory.Java11.services;

import compulsory.Java11.entity.Player;
import compulsory.Java11.repos.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * This class contains some services related to the players such as:
 *
 * returning an array list with all the players form the repository
 * creating a new player and saving it in the repository
 * deleting a player
 * modifying a player's name
 */
public class PlayerServices {
        @Autowired
        private PlayerRepository playerRepo;

        public List<Player> getAllPlayers() {
            List<Player> players = playerRepo.findAll();
            if (players.size() > 0) {
                return players;
            } else {
                System.out.println("gol");
                return new ArrayList<>();
            }
        }

        public Player save(Player player, String name) {
            player.setId(UUID.randomUUID().toString());
            player.setName(name);
            playerRepo.save(player);
            return player;
        }

        public void delete(String id) {
            playerRepo.deleteById(id);
        }

        public Player modifyName(Player player, String id) {
            player.setName(player.getName());
            return playerRepo.save(player);
        }
    }

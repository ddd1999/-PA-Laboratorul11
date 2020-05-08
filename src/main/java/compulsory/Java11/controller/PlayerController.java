package compulsory.Java11.controller;

import compulsory.Java11.entity.AddRequestPlayer;
import compulsory.Java11.entity.ModifyRequestPlayer;
import compulsory.Java11.entity.Player;
import compulsory.Java11.repos.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * With GET we obtain a list with all the players
 * With POST we create a new player and save it in the repository
 * With PUT we can modify the name of the player by id
 * With DELETE we can delete a line which contains the id
 */
@RestController
@RequestMapping("playerRepo")
public class PlayerController {
        private PlayerRepository playerRepo;

        @Autowired
        public PlayerController(PlayerRepository playerRepo) {
            this.playerRepo = playerRepo;
        }

        @RequestMapping(method = RequestMethod.GET)
        public List<Player> findAllPlayers() {
            return playerRepo.findAll();
        }

        @RequestMapping(method = RequestMethod.POST)
        public void addPlayer(@RequestBody AddRequestPlayer addReq) {
            Player player = new Player();
            player.setName(addReq.getName());
            playerRepo.save(player);
        }

        @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
        public void modifyPlayer(@PathVariable("id") long id, @RequestBody ModifyRequestPlayer modifyReq) {
            Player player = playerRepo.getOne(id);
            player.setName(modifyReq.getName());
            playerRepo.save(player);
        }

        @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
        public void deletePlayer(@PathVariable("id") long id) {
            playerRepo.deleteById(id);
        }

}



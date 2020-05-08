package compulsory.Java11.controller;

import compulsory.Java11.entity.Game;
import compulsory.Java11.services.GameServices;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * With GET we obtain a list of the games from the repository
 * With POST we create a new game and save it in the repository
 */

@RestController
@RequestMapping("gameRepo")
public class GameController {
        private final GameServices service;

        public GameController(GameServices service) {
            this.service = service;
        }

        @RequestMapping(path = "/games", method = RequestMethod.GET)
            public ResponseEntity<List<Game>> getGames() {
                List<Game> games = service.getAllGames();
                return new ResponseEntity<List<Game>>(games, new HttpHeaders(), HttpStatus.OK);
            }

            @GetMapping("/games/{id}")
            Game one(@PathVariable String id) {
                return service.findById(id);
            }

            @PostMapping("/games")
            Game newGame(@RequestBody Game newGame) {
                return service.save(newGame, newGame.getContentOfTheGame(),newGame.getDate(),newGame.getResult());
            }
}

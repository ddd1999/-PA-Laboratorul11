package compulsory.Java11.services;
import compulsory.Java11.entity.Game;
import compulsory.Java11.exceptions.GameNotFound;
import compulsory.Java11.repos.GamesRepository;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * This class is for implementing services for the game and it contains:
 *
 * a constructor for the repository
 * a method which returns all the games from the repository in an array list
 * a method to find the games by their id, and also it takes in consideration whether there is any game with that id in the repository
 * a method for saving a new game in the repository
 */

@Service
public class GameServices {
        private final GamesRepository gameRepo;

    public GameServices(GamesRepository repository) {
        this.gameRepo = repository;
    }

    public List<Game> getAllGames() {
            List<Game> games = gameRepo.findAll();
            if (games.size() > 0) {
                return games;
            } else {
                System.out.println("gol");
                return new ArrayList<>();

            }
        }
        public Game findById(String id)
        {
            return gameRepo.findById(id)
                    .orElseThrow(() -> new GameNotFound(id));
        }

        public Game save(Game game, String contentOfTheGame,String date,String result) {
            game.setId(UUID.randomUUID().toString());
            game.setDate(date);
            game.setResult(result);
            game.setContentOfTheGame(contentOfTheGame);
            gameRepo.save(game);
            return game;
        }
    }

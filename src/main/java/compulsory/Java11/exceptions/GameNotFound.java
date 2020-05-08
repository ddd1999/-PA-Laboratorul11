package compulsory.Java11.exceptions;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * I took in consideration an exception in case there is no game found on the repository
 */

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Game not found!")
public class GameNotFound extends RuntimeException  {
        public GameNotFound(String id) {
            super("Could not find game " + id);
        }
}

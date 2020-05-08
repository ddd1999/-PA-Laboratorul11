package compulsory.Java11.repos;
import compulsory.Java11.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * This is necessary when using the JpaRepository
 */
@Repository
public interface PlayerRepository extends JpaRepository<Player, Long>  { }

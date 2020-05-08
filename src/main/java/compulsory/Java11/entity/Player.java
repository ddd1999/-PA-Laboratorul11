package compulsory.Java11.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * It only contains the name and the id of the players
 */
@Entity
public class Player {
        @Id
        @GeneratedValue
        private long id;
        private String name;
        public Player(){}

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
}

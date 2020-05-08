package compulsory.Java11.entity;

import java.util.Date;

/**
 * I created it as it was required in the compulsory part
 * It only contains information about the players, a text representing the content of the game, the date and the result
 */
public class Game {
        private long id1;
        private long id2;
        private Date date;

        public void setId1(long id1) {
            this.id1 = id1;
        }

        public void setId2(long id2) {
            this.id2 = id2;
        }

        public long getId1() {
            return id1;
        }

        public long getId2() {
            return id2;
        }

        public Date getData() {
            return date;
        }

        public void setData(Date date) {
            this.date = date;
        }
}

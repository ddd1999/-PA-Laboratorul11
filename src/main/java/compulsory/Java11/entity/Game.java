package compulsory.Java11.entity;

import javax.persistence.Id;

/**
 * I created it as it was required in the compulsory part
 * It only contains information about the players, a text representing the content of the game, the date and the result
 */
public class Game {
        @Id
        private String id;
        private String contentOfTheGame;
        private String date;
        private String result;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getContentOfTheGame() {
            return contentOfTheGame;
        }

        public void setContentOfTheGame(String contentOfTheGame) {
            this.contentOfTheGame = contentOfTheGame;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getResult() {
            return result;
        }

        public void setResult(String result) {
            this.result = result;
        }
}

# -PA-Laboratorul11

For this laboratory, I created a database in order to store the games and implement REST services needed to comunicate with the database.

The **Game** class only contains information about the players, a text representing the content of the game, the date and the result.
The **Player** class only contains the name and the id of the players.

The **PlayerController** class contains methods:

- **GET**: obtaining the list of the players, via a HTTP GET request.
- **POST**: adding a new player in the database, via a HTTP POST request.
- **PUT**: modifying the name of a player, via a HTTP PUT request.
- **DELETE**: deleting a player, via a HTTP DELETE request.

(I attached on the email the screenshots from testing the services using Postman.)

**For the optional part**:
- I created a class named **GameController** similar to the PlayerController
- I implement a new repository for games (**GamesRepository**)
- I created the directory **services** which contains two classes: **GameServices** (for services related to the games) and **PlayerServices** (for services related to the players).
-  I took in consideration the exception of a "Game not found" (**GameNotFound** in the **exceptions** directory)

(I am not sure how good is the optional part, at some point I got some errors and stopped. This is as far as I could go.)

**Thank you!**

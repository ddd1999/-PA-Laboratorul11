# -PA-Laboratorul11

For this laboratory, I created a database in order to store the games and implemented REST services needed to comunicate with the database.

The **Game** class only contains information about the players, a text representing the content of the game, the date and the result.
The **Player** class only contains the name and the id of the players.

The **PlayerController** class contains methods:

- **GET**: obtaining the list of the players, via a HTTP GET request.
- **POST**: adding a new player in the database, via a HTTP POST request.
- **PUT**: modifying the name of a player, via a HTTP PUT request.
- **DELETE**: deleting a player, via a HTTP DELETE request.
(I attached on the email the screenshots from testing the services using Postman.)

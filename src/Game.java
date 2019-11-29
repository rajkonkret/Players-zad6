class Game {
    String name;
    Player[] players;

    Game(String name, Player[] players) {
        this.name = name;
        this.players = players;
    }

    String winner() {
        for (Player player : players) {
            System.out.println(player.getFullName() + " ma " + player.getPoints() + " pkt.");
            if (player.getPoints() >= 100) {
                return player.getFullName();
            }
        }
        return "Nikt bie wygrał";
    }
}


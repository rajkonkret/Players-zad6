class Player {
    private String name;
    private String username;
    private int points;

    Player(String name, String username, int points) {
        this.name = name;
        this.username = username;
        this.points = points;
    }

    String getFullName() {
        return this.name + " " + this.username;
    }

    int getPoints() {
        return this.points;
    }
}

import java.lang.management.PlatformLoggingMXBean;
import java.lang.reflect.Array;
import java.time.Period;

public class Run {
    //    Zdefiniuj dwie klasy odpowiedzialne za przechowywanie informacji o grze oraz zawodniku.
//    Klasa Game powinna zawierać:
//        -name,
//            -players.
//    Klasa Player powinna zawierać:
//        -name,
//            -username,
//            -points.
//    Klasa Game powinna zawierać również metodę winner,
//    która wypisuje na ekranie imię inazwisko wygrywającego.
//    Wygrywa zawodnik, który posiada więcej niż 100 punktów.
//    Jeśli dwaj zawodnicy mają więcej niż 100 punktów, wygrywa ten,
//    który ma ich więcej.
//    Klasa Player powinna zawierać metodę fullName zwracającą imię inazwisko gracz
    public static void main(String[] args) {
        Player[] players = new Player[10];
        Player player = new Player("Radek", "Jan", 50);
        Player player1 = new Player("Radek", "Jank", 30);
        Player player2 = new Player("Radekk", "JJank", 130);
        players[0] = player;
        players[1] = player1;
        players[2] = player2;
        Game game = new Game("Gra", players);
        System.out.println(game.players[0].getFullName());
        System.out.println("Wygrał: " + game.winner());

    }
}

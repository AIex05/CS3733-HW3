import java.util.ArrayList;
import java.util.List;

class NSF {
    private String country;
    private String sport;
    private List<Player> players;

    public NSF(String country, String sport) {
        this.country = country;
        this.sport = sport;
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public int countPlayers() {
        return players.size();
    }

    public String toString() {
        return country + " " + sport;
    }

    public void listNSFPlayers() {
        System.out.print("NSF " + toString() + " players: ");
        for (int i = 0; i < players.size(); i++) {
            System.out.print(players.get(i).getName());
            if (i != players.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}


import java.util.ArrayList;
import java.util.List;

class NSF {
    protected String country;
    protected String sport;
    protected List<Player> players;

    public NSF(String country, String sport) {
        this.country = country;
        this.sport = sport;
        this.players = new ArrayList<>();
    }

    public String getSport() {
        return sport;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void addPlayer(Player player) {
        if (!players.contains(player)) {
            players.add(player);
        }
        if (!player.getNSFs().contains(this)) {
            player.addNSF(this);
        }
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
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


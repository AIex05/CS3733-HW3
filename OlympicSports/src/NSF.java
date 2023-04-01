import java.util.ArrayList;

public class NSF {
    private String sport;
    private String country;
    private ArrayList<Player> players;

    public NSF(String country, String sport) {
        this.country = country;
        this.sport = sport;
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

    public ArrayList<Player> getPlayers() {
        return players;
    }
    public void setPlayers(ArrayList<Player> newPlayers) {
        this.players = newPlayers;
    }

    @Override
    public String toString() {
        return "NSF{" +
                "sport='" + sport + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    static void listNSFPlayers() {}
    static void addPlayer() {}
}

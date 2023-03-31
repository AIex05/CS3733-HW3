public class NSF {
    public String sport;
    public String country;

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

    public void getPlayers() {}
    static void setPlayers() {}

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

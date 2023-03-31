import java.util.ArrayList;
import java.util.List;

class ISF {
    private String name;
    private List<NSF> nsfs;

    public ISF(String name) {
        this.name = name;
        this.nsfs = new ArrayList<>();
    }

    public void addNSF(NSF nsf) {
        this.nsfs.add(nsf);
    }

    public int countNSFs() {
        return nsfs.size();
    }

    public int countPlayersInNSFs() {
        int count = 0;
        for (NSF nsf : nsfs) {
            count += nsf.countPlayers();
        }
        return count;
    }
}


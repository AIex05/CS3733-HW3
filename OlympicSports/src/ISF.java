import java.util.ArrayList;
import java.util.List;

class ISF {
    private String name;
    private List<NSF> nsfs;

    ISF(String name) {
        this.name = name;
        this.nsfs = new ArrayList<>();
    }

    void addNSF(NSF nsf) {
        this.nsfs.add(nsf);
    }

    int countNSFs() {
        return nsfs.size();
    }

    int countPlayersInNSFs() {
        int count = 0;
        for (NSF nsf : nsfs) {
            count += nsf.countPlayers();
        }
        return count;
    }
}


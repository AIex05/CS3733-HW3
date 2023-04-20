import java.util.ArrayList;
import java.util.List;

class IOC {
    private String name;
    private List<ISF> isfs;

    IOC(String continent) {
        this.name = continent;
        this.isfs = new ArrayList<>();
    }

    void addISF(ISF isf) {
        this.isfs.add(isf);
    }

    int countNSFs() {
        int count = 0;
        for (ISF isf : isfs) {
            count += isf.countNSFs();
        }
        return count;
    }

    int countPlayersinISFNSFs() {
        int count = 0;
        for (ISF isf : isfs) {
            count += isf.countPlayersInNSFs();
        }
        return count;
    }
}
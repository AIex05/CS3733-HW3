import java.util.ArrayList;
import java.util.List;

class IOC {
    private String continent;
    private List<ISF> isfs;

    public IOC(String continent) {
        this.continent = continent;
        this.isfs = new ArrayList<>();
    }

    public void addISF(ISF isf) {
        this.isfs.add(isf);
    }

    public int countNSFs() {
        int count = 0;
        for (ISF isf : isfs) {
            count += isf.countNSFs();
        }
        return count;
    }

    public int countPlayersinISFNSFs() {
        int count = 0;
        for (ISF isf : isfs) {
            count += isf.countPlayersInNSFs();
        }
        return count;
    }
}




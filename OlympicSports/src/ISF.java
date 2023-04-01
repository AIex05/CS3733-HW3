import java.util.ArrayList;

public class ISF {
    private String name;
    private ArrayList<NSF> nsfs;

    public ISF(String name) {
        this.name = name;
        this.nsfs = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<NSF> getNSF() {
        return nsfs;
    }

    public void addNSF(NSF nsf) {
        if (nsfs == null) {
            nsfs = new ArrayList<>();
        }
        nsfs.add(nsf);
    }
    public int countNSFs() {
        if (nsfs == null) {
            return 0;
        }
        return nsfs.size();
    }
    static void countPlayerInNSFs() {}
}

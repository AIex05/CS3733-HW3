import java.util.ArrayList;

public class IOC {
    private String name;
    private ArrayList<ISF> isfs;

    public IOC(String name) {
        this.name = name;
        this.isfs = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<ISF> getISF() {
        return isfs;
    }

    public void setISF(ArrayList<ISF> ISFs) {
        this.isfs = ISFs;
    }

    public int countNSF() {
        ArrayList<ISF> ISFs = getISF();
        int temp = 0;
        for (ISF isf : ISFs) {
            temp = temp + isf.countNSFs();
        }
        return temp;
    }

    static void countPlayerInNSF() {}
}

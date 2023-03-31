import java.util.ArrayList;
import java.util.List;

class Player {
    private String firstName;
    private String lastName;
    private List<NSF> nsfs;

    public Player(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nsfs = new ArrayList<>();
    }

    public void addNSF(NSF nsf) {
        this.nsfs.add(nsf);
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public String toString() {
        return getName();
    }

    public void listPlayerNSFs() {
        System.out.print(getName() + ": ");
        for (int i = 0; i < nsfs.size(); i++) {
            System.out.print(nsfs.get(i).toString());
            if (i != nsfs.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}


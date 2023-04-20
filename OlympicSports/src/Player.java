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

    public String getFirstname() {
        return firstName;
    }

    public void setFirstname(String firstname) {
        this.firstName = firstname;
    }

    public String getLastname() {
        return lastName;
    }

    public void setLastname(String lastname) {
        this.lastName = lastname;
    }

    public List<NSF> getNSFs() {
        return nsfs;
    }

    public void setNSFs(List<NSF> nsf) {
        nsfs = nsf;
    }

    public void addNSF(NSF nsf) {
        if (!nsfs.contains(nsf)) {
            nsfs.add(nsf);
        }
        if (!nsf.getPlayers().contains(this)) {
            nsf.addPlayer(this);
        }
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


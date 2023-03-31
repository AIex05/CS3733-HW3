import java.util.ArrayList;
import java.util.List;

class OlympicSports {

    public static void main(String[] args) {
        // Create 5 NSFs
        NSF nsf1 = new NSF("United States", "Basketball");
        NSF nsf2 = new NSF("Spain", "Soccer");
        NSF nsf3 = new NSF("China", "Ping Pong");
        NSF nsf4 = new NSF("India", "Cricket");
        NSF nsf5 = new NSF("Australia", "Swimming");

        // Create 15 players
        Player player1 = new Player("John", "Doe");
        Player player2 = new Player("Jane", "Smith");
        Player player3 = new Player("Mike", "Johnson");
        Player player4 = new Player("Kate", "Brown");
        Player player5 = new Player("Emma", "Taylor");
        Player player6 = new Player("Chris", "Lee");
        Player player7 = new Player("Olivia", "Martin");
        Player player8 = new Player("Ryan", "Clark");
        Player player9 = new Player("Laura", "Lee");
        Player player10 = new Player("Sam", "Green");
        Player player11 = new Player("Lucas", "King");
        Player player12 = new Player("Sophia", "Nguyen");
        Player player13 = new Player("David", "Chang");
        Player player14 = new Player("Amy", "Tam");
        Player player15 = new Player("Andrew", "Zhang");

        // Add players to NSFs
        nsf1.addPlayer(player1);
        nsf1.addPlayer(player2);
        nsf1.addPlayer(player3);
        nsf2.addPlayer(player4);
        nsf2.addPlayer(player5);
        nsf2.addPlayer(player6);
        nsf3.addPlayer(player7);
        nsf3.addPlayer(player8);
        nsf3.addPlayer(player9);
        nsf4.addPlayer(player10);
        nsf4.addPlayer(player11);
        nsf4.addPlayer(player12);
        nsf5.addPlayer(player13);
        nsf5.addPlayer(player14);
        nsf5.addPlayer(player15);

        // Add NSFs to players
        player1.addNSF(nsf1);
        player2.addNSF(nsf1);
        player3.addNSF(nsf1);
        player4.addNSF(nsf2);
        player5.addNSF(nsf2);
        player6.addNSF(nsf2);
        player7.addNSF(nsf3);
        player8.addNSF(nsf3);
        player9.addNSF(nsf3);

        // Add 3 players to another NSFs
        nsf2.addPlayer(player1);
        nsf2.addPlayer(player2);
        nsf2.addPlayer(player3);

        // Add 3 NSFs to players
        player1.addNSF(nsf2);
        player2.addNSF(nsf2);
        player3.addNSF(nsf2);

        // Create 2 ISFs
        ISF isf1 = new ISF("International Basketball Federation");
        ISF isf2 = new ISF("International Football Association");

        // Add NSFs to ISFs
        isf1.addNSF(nsf1);
        isf1.addNSF(nsf2);
        isf1.addNSF(nsf3);
        isf2.addNSF(nsf4);
        isf2.addNSF(nsf5);

        // Create an IOC that contains the 2 ISFs
        IOC ioc = new IOC("Africa");
        ioc.addISF(isf1);
        ioc.addISF(isf2);

        // Display players for NSFs
        nsf1.listNSFPlayers();
        nsf2.listNSFPlayers();
        nsf3.listNSFPlayers();
        nsf4.listNSFPlayers();
        nsf5.listNSFPlayers();

        // Display NSFs for two players
        player1.listPlayerNSFs();
        player2.listPlayerNSFs();

        // Display the total number of players registered with NSFs in each ISF

        System.out.println("Total number of players in isf1: "+ isf1.countPlayersInNSFs());
        System.out.println("Total number of players in isf2: "+ isf2.countPlayersInNSFs());

        // Display the total number of players registered with NSFs in the IOC
        System.out.println("Total number of players in ioc: "+ ioc.countPlayersinISFNSFs());

        // Display the total number of NSFs in each ISF
        System.out.println("Total number of NSFs in isf1: "+ isf1.countNSFs());
        System.out.println("Total number of NSFs in isf2: "+ isf2.countNSFs());

        // Display the total number of NSFs in the IOC
        System.out.println("Total number of NSFs in ioc: "+ ioc.countNSFs());
    }
}
import java.util.Scanner;

public class App {

    Card c = new Card("Goods", 2);
    Deck d = new Deck();
    Player p1 = new Player("Player1");
    Player p2 = new Player("Player2");
    Scanner scan = new Scanner(System.in);

    App(){

    }


    public void welcome(){
        System.out.println("\n\n\nPoker Simulation\n\n\n");
        System.out.println("You are given a hand of 5 cards out of a 52-card deck. \n" +
                "In each round, each players will reveal their cards, and the player with the highest card wins.");
        System.out.println("Would you like to start? [Type 'Y' for Yes and 'N' for No]");
        String ans = scan.next();
        if(ans.equalsIgnoreCase("Y")){
            begin();
        } else if(ans.equalsIgnoreCase("N")) {
            System.out.println("Game Ended");
        } else{
            System.out.println("Invalid answer");
        }
    }

    public void shuffle(){
        d.shuffleDeck();
        System.out.println("Shuffled Deck:");
        d.displayDeck();
        System.out.println();
    }
    public void begin(){

    }

}

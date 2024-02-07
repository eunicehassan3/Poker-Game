public class Main {

    public static void determineWinner(Player p1, Player p2) {
        int max1 = p1.highestCardValue();
        int max2 = p2.highestCardValue();

        if (p1.getHand() == null || p2.getHand() == null) {
            System.out.println("Game is tied");
        }

        if (max1 == max2) {
            p1.remove(p1.highestCard());
            p2.remove(p2.highestCard());
            determineWinner(p1, p2);
        } else if (max1 > max2) {
            p1.increaseScore();
            System.out.println(p1.getName() + " won");
        } else {
            p2.increaseScore();
            System.out.println(p2.getName() + " won");
        }
    }

    public static void main(String[] args) {
        Card c = new Card("Heart", 2);
        Deck d = new Deck();
        Player p1 = new Player("Player 1");
        Player p2 = new Player("Player 2");
        int round = 1;

        System.out.println("Initial Deck:");
        //c.display();
        d.initialDeck();
        d.displayDeck();
        System.out.println();

        System.out.println("Shuffled Deck:");
        d.shuffleDeck();
        d.displayDeck();
        System.out.println();


        while (d.size() > 2) {
            System.out.println("\n\nRound " + round + ": ");
            System.out.println("-----------------------------------------");
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    p1.draw(d);
                } else {
                    p2.draw(d);
                }
            }

            //determine winner
            System.out.println(p1.getName() + "'s Hand: " + p1.getHand());
            System.out.println(p2.getName() + "'s Hand: " + p2.getHand());

            determineWinner(p1, p2);

//            int max1 = p1.highestCardValue();
//            int max2 = p2.highestCardValue();
//
//            if (max1 == max2) {
//                p1.increaseScore();
//                p2.increaseScore();
//                System.out.println("It's a tie");
//            } else if (max1 > max2) {
//                p1.increaseScore();
//                System.out.println(p1.getName() + " won");
//            } else {
//                p2.increaseScore();
//                System.out.println(p2.getName() + " won");
//            }
//        }

            System.out.println("Score: " + p1.getScore() + " - " + p2.getScore());
            p1.reset();
            p2.reset();
            round++;

        }
        System.out.println();
        if (p1.getScore() > p2.getScore()) {
            System.out.println("Congratulations! " + p1.getName() + " won the game.");
        } else if (p1.getScore() < p2.getScore()) {
            System.out.println("Congratulations! " + p2.getName() + " won the game.");
        } else {
            System.out.println("The game was tied.");
        }

    }
}


//           p1.createHand(d);
//           p2.createHand(d);
// System.out.println(d.size());

//            System.out.println(p1.getName() + " score: " + p1.getScore());
//            System.out.println(p2.getName() + " score: " + p2.getScore());
public class Game {
    public void determineWinner(Player p1, Player p2) {
        int max1 = p1.highestCardValue();
        int max2 = p2.highestCardValue();

        if (max1 == max2) {
            p1.remove(p1.highestCard());
            p2.remove(p2.highestCard());
            if(p1.getHand().size() == 0 && p2.getHand().size() == 0){
                System.out.println("Game is tied");
            }
            else{
                determineWinner(p1, p2);
            }
        } else if (max1 > max2) {
            p1.increaseScore();
            System.out.println(p1.getName() + " won");
        } else {
            p2.increaseScore();
            System.out.println(p2.getName() + " won");

        }

    }

}

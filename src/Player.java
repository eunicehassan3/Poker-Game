import java.util.ArrayList;
import java.util.Collections;

public class Player {
    private String name;
    private int score;
    private ArrayList<Card> hand = new ArrayList<>();

    Player(String name) {
        this.name = name;
        score = 0;
    }

    //accessors and mutators
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    //adds score to player
    public void increaseScore() {
        score++;
    }

    //add to hand
    public void draw(Deck deck) {
        hand.add(deck.remove());
    }

    public int highestCardValue() {
        getHand();
        if(getHand().size() == 0){
            return -1 ;
        }
        int max = hand.get(0).getValue();
        for(int i = 1; i < hand.size(); i++){
            if(hand.get(i).getValue() > max){
                max = hand.get(i).getValue();
            }
        }
        return max;
    }

    public Card highestCard(){
        getHand();
        if (hand.size() == 0){
            System.out.println("Hand is empty.");
        }
        int max = hand.get(0).getValue();
        Card maxCard = hand.get(0);
        for(int i = 0; i < hand.size(); i++){
            if(hand.get(i).getValue() > max){
                max = hand.get(i).getValue();
                maxCard = hand.get(i);
            }
        }
        return maxCard;
    }

    public void reset() {
        hand.clear();
    }

    public Card remove(Card c){
        if(hand.size() != 0){
            for(int i = 0; i < hand.size(); i++){
                if(hand.get(i).equals(c)){
                    Card card = hand.remove(i);
                    return card;
                }
            }
        }
        return null;
    }
//
//    public void createHand(Deck deck) {
//        for (int i = 0; i < 5; i++) {
//                draw(deck);
//            }
//        }
 }





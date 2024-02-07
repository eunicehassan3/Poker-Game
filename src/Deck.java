import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Deck {
    ArrayList<Card> fullDeck = new ArrayList<>();
    public String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades"};
    public int[] ranks = {2,3,4,5,6,7,8,9,10,11,12,13,14};

    public Deck(){
    }

    public ArrayList<Card> getFullDeck() {
        return fullDeck;
    }

    public void setFullDeck(ArrayList<Card> fullDeck) {
        this.fullDeck = fullDeck;
    }

    public void initialDeck(){
        for(String suit: suits){
            for(int rank: ranks){
                fullDeck.add(new Card(suit, rank));
            }
        }
    }

    public void shuffleDeck(){
        Collections.shuffle(fullDeck);
    }

    public void displayDeck(){
        System.out.println(fullDeck);
    }
    //removes from deck
    public Card remove(){
        Card card = fullDeck.remove(0);
        return card;
    }

    public int size(){
        return fullDeck.size();
    }
}

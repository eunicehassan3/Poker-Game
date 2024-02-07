public class Card {
    private String suit;
    private String rank;
    private  String name;
    private int value;


    Card(String suit, int value) {
        this.suit = suit;
        this.rank = rank;
        this.value = value;
        name = "";
        switch (value) {
            case 2:
                rank = "2";
                break;
            case 3:
                rank = "3";
                break;
            case 4:
                rank = "4";
                break;
            case 5:
                rank = "5";
                break;
            case 6:
                rank = "6";
                break;
            case 7:
                rank = "7";
                break;
            case 8:
                rank = "8";
                break;
            case 9:
                rank = "9";
                break;
            case 10:
                rank = "10";
                break;
            case 11:
                rank = "Jack";
                break;
            case 12:
                rank = "Queen";
                break;
            case 13:
                rank = "King";
                break;
            case 14:
                rank = "Ace";
                break;
        }
        name += rank + " of " + suit;
    }

    public void display(){
        System.out.println(name);
    }
    public String getSuit(){
        return suit;
    }
    public String getRank(){
        return rank;
    }
    public int getValue(){
        return value;
    }
    public void setSuit(String s){
        suit = s;
    }
    public void setRank(String r){
        rank = r;
    }

    @Override
    public String toString(){
        return name;
    }
}


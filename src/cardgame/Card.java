
package cardgame;
/*
Name- Om Amin
Date- 05/02/2022
*/
public class Card {

   
    public enum Suit {
        HEARTS, CLUBS, SPADES, DIAMONDS, STAR
      }
    
    public enum Value {
            ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN,
            EIGHT, NINE, TEN, JACK, QUEEN, KING, EMPEROR
       }
    
    private Value value;
    private Suit suit;
    

    public Card(Value value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    
    
    public Value getValue() {
        return this.value;
    }
    public void setValue(Value value) {
        this.value = value;
    }

    public Suit getSuit() {
        return this.suit;
    }

  
    public void setSuit(Suit suit) {
        this.suit = suit;
    }

}

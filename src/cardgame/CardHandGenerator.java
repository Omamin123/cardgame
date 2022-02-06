
package cardgame;

/**
 *
 * @author Om
 */
import cardgame.Card.Suit;
import cardgame.Card.Value;
import java.util.Random;

public class CardHandGenerator {


    public static Card[] generateHand(int numCards, 
            Value[] cardValues, Suit[] cardSuits) {
        
        Random random = new Random();
        
        Card[] hand = new Card[numCards];

        for (int i = 0; i < hand.length; i++) {
            Card.Value value = cardValues[random.nextInt(cardValues.length)];
            Card.Suit suit = cardSuits[random.nextInt(cardSuits.length)];

            Card card = new Card(value, suit);
            hand[i] = card;
        }
        return hand;
    }

}
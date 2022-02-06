package cardgame;


import cardgame.Card.Suit;
import cardgame.Card.Value;
import java.util.Scanner;

/**
 *
 *
 * @author Om Amin
  *Date- 05/02/2022
 */                                                                          
public class CardGame {
 
 
    public static void main(String[] args) {
        Scanner om = new Scanner(System.in);

                                                                           
        Value[] cardValues = Value.values();                                       

        Suit[] cardSuits = Suit.values();
        
        Card[] hand = CardHandGenerator.generateHand(7, cardValues, cardSuits);


        System.out.println("Here are the cards in the hand");
        for (Card card : hand) {
            System.out.printf("%s of %s\n", card.getValue(), card.getSuit());
        }

        
        System.out.println("Pick a suit for your card");
        for (int i = 0; i < cardSuits.length; i++) {
            System.out.println((i + 1) + ": " + cardSuits[i]);
        }
        int suitPosition = om.nextInt() - 1;

        System.out.println("Enter a value");
        for (int i = 0; i < cardValues.length; i++) {
            System.out.println((i + 1) + ": " + cardValues[i]);
        }

        int valuePosition = om.nextInt() - 1;

        Card userGuess = new Card(cardValues[valuePosition], 
                cardSuits[suitPosition]);

        boolean match = false;
        for (Card card : hand) {
            if (card.getValue() == userGuess.getValue()
                    && card.getSuit()== userGuess.getSuit()) {
                match = true;
                break;
            }
        }

        String response = match ? "Correct guess" : "Not matchable";

        printInfo(response);
    }



public static void printInfo(String response)
{
System.out.println(response);
}
}

/*
 * Author: Sukhdev Banwait
 */

package CardGame;

public class Card {
    
        public enum Suit {HEARTS, CLUBS,SPADES,DIAMONDS};
        public enum Value{ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING};
        private final Suit suit;
        private final Value value;
        private static final String JOKER = "Joker";
        
        public Card(Suit s, Value gVal)
        {
           suit =s;
           value= gVal;
        }
	public Value getValue() {
		return this.value;
	}

	public static String getJoker() {
            return JOKER;
        }
        
	public Suit getSuit() {
		return this.suit;
        }
}
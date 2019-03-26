package elevensgame;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//make a Deck class
public class Deck{

	public static final int NUMCARDS = 52;
	public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");
	
	private List<Card> cards;
	private int top;

   //make a Deck constructor
   	//refer cards to new ArrayList
   	//set top to the top of the deck 51
   	
   	//loop through all suits
   		//loop through all faces 1 to 13
   			//add a new TwentyOneCard to the deck
        public Deck(){
            cards = new ArrayList<Card>(52);
            for(int i = 0; i<SUITS.length; i++){
                for(int x = 1; x<=13; x++){
                    cards.add(new BlackJackCard(SUITS[i], x));
                }
            }
        }

   
   //make a dealCard() method that returns the top card
        public String dealCard(){
            String top = cards.get(0).toString();
            cards.add(cards.get(0));
            cards.remove(0);
            return top;
        }
   //write a shuffle() method
   	//use Colletions.shuffle
   	//reset the top card 
        public void shuffle(){
            Collections.shuffle(cards);
        }
}

package javaFinalCodingProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	List<Card> cards = new ArrayList<>();
			
	public Deck() {
		
		String[] suits = {"Hearts","Diamonds","Clubs", "Spades"};
		String[] names = {"Two", "Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King", "Ace"}; 
		
		
		for (String suit : suits) {
			int value = 2;
			for (String name : names) {
				Card card = new Card(name,suit,value);
				this.cards.add(card);
				value ++;
			} //end for
		} // end for
	}

	//setters and getters 
	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
	
	public void shuffle() { //shuffle deck using collections .shuffle method
		Collections.shuffle(this.cards);
	}
	
	public void describe() { // print out the deck of cards
		for(Card card : cards) {
			card.describe();
		}
	}
	
	public Card draw() { // deal a card from the deck and remove the element associated from the list array
		Card card = this.cards.remove(0);
		return card;
	}
}

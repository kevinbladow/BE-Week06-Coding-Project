package javaFinalCodingProject;

import java.util.ArrayList;
import java.util.List;

public class Player {

	List<Card> hand = new ArrayList<>();
	String playerName;
	int score=0;
	
	public Player() {};  //default constructor
	
	public Player(String playerName, List<Card> hand, int score ) {// assign player numbers
	}

	//getters and setters
	
	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}		
	
	
		
	public void describe() {
		if (this.hand != null) {
			System.out.println(this.playerName + " has the following hand:");
			for(Card card : this.hand){
			card.describe();
			} //end for
		} else { //end if
			System.out.println(this.playerName + " has no cards yet!");
		}
	} // end method describe
	
	public Card flip() {
		Card card = this.hand.remove(0);
		return card;
	} // end method flip
			
	public List<Card> draw(Deck cards) {
		Card drawnCard = new Card();
		drawnCard = cards.draw();
		//  drawnCard.describe();		//diagnsotic
		this.hand.add(drawnCard);
		return this.hand;
	} // end method draw
	
	public void incrementScore() {
		this.score++;
	} // end method incrementScore
			
}

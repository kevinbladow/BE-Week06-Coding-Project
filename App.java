package javaFinalCodingProject;

public class App {

	public static void main(String[] args) {
		
						
		// create deck with 52 cards
		
		Deck playingDeck = new Deck();
		//  playingDeck.describe();
		
		// create player with 2 players
		System.out.println("Create Game of War with two players; Player 1 and Player 2");
		Player player1 = new Player();
		player1.playerName = "Player 1";
		Player player2 = new Player();
		player2.playerName = "Player 2";
		System.out.println("Both players start with an empty hand.");
		System.out.println();
		 //player1.describe();    //diagnostic
		//player2.describe();	//diagnostic
		 
		 
		 //shuffle the deck
		 
		 playingDeck.shuffle();
		 
		  // execute the game
		 
		 // deal the cards to each player then show each players hand
		 for( int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				// System.out.println("Deal Player 1");		//diagnostic
				player1.draw(playingDeck);
			} else {
			// System.out.println("Deal Player 2");			//diagnostic
			player2.draw(playingDeck);
			} //end else
		 }
		//  player1.describe();		// diagnostic
		//  player2.describe();		// diagnostic

		 // play the game!!
		 for (int i=0; i < 26; i++) {
			 System.out.println("         Round: " + i);
			 System.out.println("===========================");
			 Card card1 = player1.flip();
			 Card card2 = player2.flip();
			 System.out.println("Player 1 shows: ");
			 card1.describe();
			 System.out.println("Player 2 shows: ");
			 card2.describe();
			 
			if(card1.getValue() > card2.getValue()) {// how to grab the value at the right card?
				player1.score +=1;
				System.out.println("\tPlayer 1 has the high card!");
				System.out.println();
			} else { 
				if(card1.getValue() < card2.getValue()) {
				player2.score +=1;
				System.out.println("\tPlayer 2 has the high card!");
				System.out.println();
				} // end if
				else {
				System.out.println("\tDraw! No points awarded!");
				System.out.println();
			}// end else 
			}
			System.out.println("Player 1 score: " + player1.getScore());
			System.out.println("Player 2 score: " + player2.getScore());
			System.out.println();
		 } // end for
		 
		 if (player1.getScore() > player2.getScore()) {
			 System.out.println("\t\tPlayer 1 Wins");
		 } // end if
		 else {
			 if (player1.getScore() < player2.getScore()) {
		 		 System.out.println("\t\tPlayer 2 Wins");
		 } //end if
			 else {
			 System.out.println("\t\tDraw!");
			 } // end else
		 } // end else
	}  //end main

}

package javaFinalCodingProject;

public class Card {

		
		String name;
		String suit;
		int value;
		
		public Card() {}  // default constructor
			
		public Card(String name, String suit, int value) {  // define card object
			this.name = name;
			this.suit = suit;
			this.value = value;
		}

		// getters and setters
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSuit() {
			return suit;
		}

		public void setSuit(String suit) {
			this.suit = suit;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}
		
	
		public void describe() {
			System.out.println("The " + name + " of " + suit);
		}
}

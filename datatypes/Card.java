package datatypes;

import java.util.ArrayList;

public class Card {

	public static final String FACE_ACE = "ACE";
	public static final String FACE_TWO = "TWO";
	public static final String FACE_THREE = "THREE";
	public static final String FACE_FOUR = "FOUR";
	public static final String FACE_FIVE = "FIVE";
	public static final String FACE_SIX = "SIX";
	public static final String FACE_SEVEN = "SEVEN";
	public static final String FACE_EIGHT = "EIGHT";
	public static final String FACE_NINE = "NINE";
	public static final String FACE_TEN = "TEN";
	public static final String FACE_JACK = "JACK";
	public static final String FACE_QUEEN = "QUEEN";
	public static final String FACE_KING = "KING";
	

	public static final String SUIT_CLUBS = "CLUBS";
	public static final String SUIT_SPADES = "SPADES";
	public static final String SUIT_HEARTS = "HEARTS";
	public static final String SUIT_DIAMONDS = "DIAMONDS";
	
	private String _face;
	private String _suit;
	
	public Card(String p_face, String p_suit) {
		this._face = p_face;
		this._suit = p_suit;
	}
	
	
	
	public String toString(){
		return _face + " of " + _suit;
	}

	/**
	 * 
	 * @return whether card is diamond/heart (true)
	 */
	public Boolean isRed(){
		return _suit == SUIT_DIAMONDS || _suit == SUIT_HEARTS;
	}
	
	/**
	 * 
	 * @return the face value of the card (ace is 1, jack is 11...)
	 */
	public Number get_value() {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add(FACE_ACE);
		list.add(FACE_TWO);
		list.add(FACE_THREE);
		list.add(FACE_FOUR);
		list.add(FACE_FIVE);
		list.add(FACE_SIX);
		list.add(FACE_SEVEN);
		list.add(FACE_EIGHT);
		list.add(FACE_NINE);
		list.add(FACE_TEN);
		list.add(FACE_JACK);
		list.add(FACE_QUEEN);
		list.add(FACE_KING);
		
		return 1 + list.indexOf(_face);
	}

	
	
}

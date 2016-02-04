
/**
 * Tester for Card class
 * 
 * @author Phillip Kerman 
 * @version 0.0.1 3-feb-2016
 */

import datatypes.Card;

public class Main
{
    
    /**
     * Constructor for objects of class Main
     */
    public static void main(String[] args)
    {
    	
    	Card myCard = new Card(Card.FACE_ACE, Card.SUIT_DIAMONDS);
    	
    	System.out.println(myCard + " has a value of " + myCard.get_value());
    	
    	System.out.println(myCard.isRed());
    	
    }

    
}

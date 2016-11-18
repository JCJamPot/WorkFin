import java.io.*;
import java.util.*;


public class Run {
	
	public static void main(String[] args) {
		Rng r = new Lcg();
		Factory fac = new Factory();
		Game g = fac.getGame(errors.validateGame());
		g.play(r);
		
		
		
		
	}

	// public static void runCardGame(Rng r) {

	// 	ArrayList<String> deck = cardGame.shuffle(cardGame.generateDeck(), r);
	// 	cardGame.chooseCards(deck, r);
	// }

	// public static void runDiceGame(Rng r) {

		

	// }
}
import java.util.*;


public class diceGame implements Game {

  public void play(Rng r){

    diceGame.rollDice(r);

  }

	public static void rollDice(Rng r){
		HashSet<Integer> numbersRolled=new HashSet<Integer>();

      for (int i=0; i<2; i++) {
      	errors.nextLn("roll the die");
        
        int dieRoll=(int)(r.next() * 6) + 1;

        System.out.println("You rolled " + dieRoll);
        numbersRolled.add(new Integer(dieRoll));
      }

      // Display the numbers rolled
      System.out.println("Numbers rolled: " + numbersRolled);

      // Now see if (s)he has won!
      if (numbersRolled.contains(new Integer(1))) {
        System.out.println("You won!");
      }
      else System.out.println("You lost!");
	}

}
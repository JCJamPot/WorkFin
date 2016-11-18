

public class Factory {

	public Game getGame(int ans){

		if(ans == 1) {
			return new cardGame();
		}
		else {
			return new diceGame();
		}

	}

}
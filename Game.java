package bowlingGame;

public class Game {
	protected int[] frame = new int[20];
	
	public int calcScore() {
		int score = 0;
		for (int i = 0; i < frame.length; i++)
			score += frame[i];
		
		return score;		
	}
}

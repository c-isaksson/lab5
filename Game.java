package bowlingGame;

public class Game {
	protected int[] frames = new int[20];
	
	public int calcScore() {
		int score = 0;
		int index = 0;
		for (int i = 0; i < 10; i++) {
			if (isStrike(index)) {
				if (multipleStrike(index))
					score += 10 +frames[index+2] +frames[index+4];
				else
					score += 10 +frames[index+2] +frames[index+3];
			}
			else if (isSpare(index))
				score += 10 +frames[index+2];
			else 
				score += frames[index] +frames[index+1];
			
			index += 2;		
		}
		return score;		
	}
	
	private boolean isStrike(int index) {
		return frames[index] == 10;
	}
	private boolean isSpare(int index) {
		return frames[index] + frames[index+1] == 10;
	}
	private boolean multipleStrike(int index) {
		return frames[index+2] == 10;
	}

	
}
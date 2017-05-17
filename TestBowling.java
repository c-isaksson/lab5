package bowlingGame;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {	
	
	private Game game = new Game();

	@Test
	public void testGameScore() {
		int roll[] = { 1,5, 3,6, 7,2, 3,6, 4,4, 5,3, 3,3, 4,5, 8,1, 2,6 };
		game.frame = roll;

		assertEquals(game.calcScore(), 81);
	}
}

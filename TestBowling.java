package bowlingGame;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {	
	
	private Game game = new Game();

	@Test
	public void testRealGame() {
		int roll[] = { 6,3, 7,1, 8,2, 7,2, 10,0, 6,2, 7,3, 10,0, 8,0, 7,3, 10 };
		game.frames = roll;

		assertEquals(game.calcScore(), 135);
	}
}

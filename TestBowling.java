package bowlingGame;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {	
	
	private Game game = new Game();

	@Test
	public void testStrikeAndSpare() {
		int roll[] = { 8,2, 5,5, 7,2, 3,6, 4,4, 5,3, 3,3, 4,5, 8,1, 2,6 };
		game.frames = roll;

		assertEquals(game.calcScore(), 98);
	}
}

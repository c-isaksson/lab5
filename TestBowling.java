package bowlingGame;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {	
	
	private Game game = new Game();

	@Test
	public void testPerfectGame() {
		int roll[] = { 10,0, 10,0, 10,0, 10,0, 10,0, 10,0, 10,0, 10,0, 10,0, 10,0, 10,10 };
		game.frames = roll;

		assertEquals(game.calcScore(), 300);
	}
}

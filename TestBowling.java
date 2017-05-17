package bowlingGame;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void testFrameScore() {
		int[] frame = new int[] {2, 4};
		int score = 0;
		for (int i = 0; i < frame.length; i++ )
			score += frame[i];
		assertEquals(score, 6);
	}
}

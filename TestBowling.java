package bowlingGame;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void firstTest() {
		int[] frame = new int[] {2, 4};
		assertEquals(frame.length, 2);
	}
}

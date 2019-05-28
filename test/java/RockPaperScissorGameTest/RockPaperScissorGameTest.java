package RockPaperScissorGameTest;


import RockPaperScissorGame.RockPaperScissorGame;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RockPaperScissorGameTest {
    @Test
    public void shouldGiveResult() {

        String expected = "draw";
        assertEquals(expected, RockPaperScissorGame.getResult("rock", "rock"));
    }




}

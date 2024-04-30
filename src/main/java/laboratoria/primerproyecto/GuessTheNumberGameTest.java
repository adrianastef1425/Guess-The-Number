package laboratoria.primerproyecto;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class GuessTheNumberGameTest {

    @Test
    void main() {
    ComputerPlayer obj = new ComputerPlayer();
    int input = obj.makeGuess();
    assertTrue(input >= 0);
    assertTrue(input <= 100);


    ComputerPlayer computerPlayer = Mockito.mock(ComputerPlayer.class);
    GuessTheNumberGame game = new GuessTheNumberGame();
    Mockito.when(computerPlayer.makeGuess()).thenReturn(-1);
    assertTrue(game.checkGuessPlayer(computerPlayer));

    Mockito.when(computerPlayer.makeGuess()).thenReturn(101);
    assertTrue(game.checkGuessPlayer(computerPlayer));

    Mockito.when(computerPlayer.makeGuess()).thenReturn(game.getTargetNumber());
    assertFalse(game.checkGuessPlayer(computerPlayer));
    }
    //mockear computerplayer devolviendo -1 y 101(para que siempre sea menor o mayor)
}
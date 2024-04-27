package laboratoria.primerproyecto;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame{
    private static java.util.Random random;
    private int targetNumber;

    private boolean checkGuessPlayer(Player player) {
        return true;
    }
    /*
    public GuessTheNumberGame(Player player) {
        //inicia el juego, colocar quien va a ser el player
    }*/

    public static void main(String[] args) {
        //llamar a la clase GuessTheNumberGame
        random = new java.util.Random();
        int numPC = random.nextInt(100);
        System.out.println("Numero de la maquina: " + numPC);
        HumanPlayer namePlayer = new HumanPlayer();
        System.out.println("Ingresa tu nombre: ");
        String name = namePlayer.getName();

        //System.out.println("El número que escribiste es: " + numHuman);
        for (int i = 0; i < 100; i++) {
            System.out.println(name + ", ingresa un numero entre 1 y el 100: ");
            HumanPlayer numPlayer = new HumanPlayer();
            int numHuman = numPlayer.makeGuess();
            if (numHuman > numPC) {
                System.out.println("Tu número es mayor, sigue jugando");
            } else if (numHuman < numPC) {
                System.out.println("Tu número es menor, sigue jugando");
            } else {
                System.out.println("Acertaste");
                break;
            }
        }
    }
}






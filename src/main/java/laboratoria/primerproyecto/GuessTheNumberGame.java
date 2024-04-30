package laboratoria.primerproyecto;

import java.util.ArrayList;
import java.util.List;

public class GuessTheNumberGame{
    private static java.util.Random random;
    private static int targetNumber;//private?

    public GuessTheNumberGame(){
        random = new java.util.Random();
        targetNumber = random.nextInt(100);
    }

    public int getTargetNumber() {//para los test
        return targetNumber;
    }

    public static boolean checkGuessPlayer(Player player) {//private? esta en public para los test
        List<Integer> guessesPlayer = player.getGuesses();
        List<String> guessesLowOrHigh = player.getLowOrHigh();

        int targetPlayer = player.makeGuess();

        guessesPlayer.add(targetPlayer);

        if (targetPlayer > targetNumber) {
            guessesLowOrHigh.add("high");
            System.out.println("El número " + targetPlayer + " es mayor, sigue jugando.");
            return true;
        } else if (targetPlayer < targetNumber) {
            guessesLowOrHigh.add("low");
            System.out.println("El número " + targetPlayer + " es menor, sigue jugando.");
            return true;
        }
        System.out.println("Acertaste");
        return false;
    }

    public static void main(String[] args) {
        //random = new java.util.Random();
        //targetNumber = random.nextInt(100);

        GuessTheNumberGame game =  new GuessTheNumberGame();

        System.out.println("BIENVENIDAS!!!, este es el juego - ADIVINA EL NUMERO-");
        System.out.println("El juego consiste en que jugarás contra la computadora adivinando el número secreto.");
        System.out.println("Puedes usar números entre el 1 y el 100.");
        System.out.println("Gana quíen acierte el número primero :).");

        System.out.println("Numero secreto: XX" + game.targetNumber + "XX");

        HumanPlayer humanPlayer = new HumanPlayer();
        ComputerPlayer computerPlayer = new ComputerPlayer();

        System.out.println("Ingresa tu nombre: ");
        String name = humanPlayer.getName();
        //humanPlayer.guesses = new ArrayList<>();
        //computerPlayer.guesses = new ArrayList<>();

        while(true) {
            System.out.println("----- Jugadora -----" );
            System.out.println(name + ", ingresa un numero entre 1 y el 100: ");
            if (!checkGuessPlayer(humanPlayer)){
                break;
            }
            System.out.println("----- Computadora -----" );
            System.out.println("Computadora ingresa un numero entre 1 y el 100: ");

            if(!checkGuessPlayer(computerPlayer)){
                break;
            }

        }
        System.out.println(name + " tuviste " + humanPlayer.getGuesses().size() + " intentos y fueron: " + humanPlayer.getGuesses());
        System.out.println("Los intentos de la computadora fueron : " + computerPlayer.getGuesses());
        System.out.println("mayor o menor de la computadora" + computerPlayer.getLowOrHigh());
    }
}

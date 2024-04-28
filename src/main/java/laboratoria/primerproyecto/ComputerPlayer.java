package laboratoria.primerproyecto;

public class ComputerPlayer extends Player{
    private java.util.Random random;

    public int makeGuess() {
        random = new java.util.Random();
        int inputComputer = random.nextInt(100);
        System.out.println(inputComputer);
        return  inputComputer;
    }
}

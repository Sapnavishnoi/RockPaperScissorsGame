import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorGame {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter your choice");

        String playerChoice = myObj.nextLine();
        List<String> moves = Arrays.asList("rock", "paper", "scissor");


        Random rand = new Random();
        int randomInput = rand.nextInt(2);
        String computerChoice = moves.get(randomInput);

        if (playerChoice.equals(computerChoice)) {
            System.out.println("draw");
        } else if (playerChoice.equals("rock") && computerChoice.equals("scissors")) {
            System.out.println("win");
        } else if (playerChoice.equals("scissor") && computerChoice.equals("paper")) {
            System.out.println("win");
        } else if (playerChoice.equals("paper") && computerChoice.equals("rock")) {
            System.out.println("win");
        } else {
            System.out.println("lose");
        }


    }
}

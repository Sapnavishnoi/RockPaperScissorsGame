package RockPaperScissorGame;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorGame {
    public static String getResult(String computerChoice, String playerChoice) {
        if (isEquals(playerChoice, computerChoice)) {
            return "draw";
        } else if (isEquals(playerChoice, "rock") && isEquals(computerChoice, "scissors")) {
            return "win";
        } else if (isEquals(playerChoice, "scissor") && isEquals(computerChoice, "paper")) {
            return "win";
        } else if (isEquals(playerChoice, "paper") && isEquals(computerChoice, "rock")) {
            return "win";
        } else {
            return "lose";
        }

    }

    public static void main(String[] args) {
        while (true) {
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter your choice");

            String playerChoice = myObj.nextLine();
            List<String> moves = Arrays.asList("rock", "paper", "scissor");


            Random rand = new Random();
            int randomInput = rand.nextInt(2);
            String computerChoice = moves.get(randomInput);

            System.out.println(getResult(computerChoice,playerChoice));

            Scanner myObject = new Scanner(System.in);  // Create a Scanner object
            System.out.println("you want to play again");

            String again = myObject.nextLine();

            if (isEquals(again, "exit")) {
                break;
            } else if (isEquals(again, "yes")) {
                continue;
            }
        }


    }

    private static boolean isEquals(String playerChoice, String computerChoice) {
        return playerChoice.equals(computerChoice);
    }
}

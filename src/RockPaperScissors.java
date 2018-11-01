import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[]args) {

        Scanner keyboard;

        int userPicked;
        int computerNumber;
        String again;
        int computerScore;
        int playerScore;
        computerScore = 0;
        playerScore = 0;

        keyboard = new Scanner(System.in);
        do {
            System.out.println("Choose a number. (1-3) (Rock=1, Paper=2, Scissors=3).");
            System.out.println("What would you like to choose first?");
            userPicked = keyboard.nextInt();
            computerNumber = (int) (Math.random() * 3) + 1;

            if (computerNumber == 1) {
                System.out.println("I chose Rock.");
            } else if (computerNumber == 2) {
                System.out.println("I chose Paper.");
            } else if (computerNumber == 3) {
                System.out.println("I chose Scissors.");
            }
            again = "";

            if (userPicked == computerNumber) {
                System.out.println("It's a tie. That's tuff :( ");
                System.out.println("No points for either of us.");

            } else if (userPicked == 1 && computerNumber == 2) {
                System.out.println("Haha! I win, you lose!");
                computerScore += 1;
                System.out.println("I get 1 point.");

            } else if (userPicked == 1 && computerNumber == 3) {
                System.out.println("Aww man, you win this time around.");
                playerScore += 1;
                System.out.println("You get 1 point.");

            } else if (userPicked == 2 && computerNumber == 1) {
                System.out.println("Dang, you win.");
                playerScore += 1;
                System.out.println("You get one point.");

            } else if (userPicked == 2 && computerNumber == 3) {
                System.out.println("You're trash! Get better.");
                computerScore += 1;
                System.out.println("I get one point.");

            } else if (userPicked == 3 && computerNumber == 1) {
                System.out.println("How are you so bad at this?!");
                computerScore += 1;
                System.out.println("I get one point.");

            } else if (userPicked == 3 && computerNumber == 2) {
                System.out.println("You just got lucky.");
                playerScore += 1;
                System.out.println("You get one point.");
            }


            System.out.println("Your score is "+ playerScore + "and mine is " + computerScore + ".");
            System.out.println("Would you like to play again? (yes or no)");
            again = keyboard.next().toLowerCase();

        }while (again.equals("yes"));
        System.out.println("Your final score is "+ playerScore +".");
        System.out.println("My final score is "+ computerScore +".");
        if (playerScore==computerScore) {
        System.out.println("It's a tie!");
        }
        else if (playerScore<computerScore) {
            System.out.println("Haha, I win you loser");
        }
        else if (playerScore>computerScore) {
            System.out.println("You only won because you cheated.");
        }
        System.out.println("Bye,thanks for playing.");


    } //
}


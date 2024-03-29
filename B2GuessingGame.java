import java.util.Random;

class B2GuessingGame extends ConsoleProgram {

  /**
  * Guessing game where user guesses number between 1 and 100 until they get it right
  * @author: C. Chen
  */
  
  public void run() {
    
    // Generate random object
    Random randomNum = new Random();

    // Declare variable
    int intAnswer;
    int intGuess;

    // Generate random number
    intAnswer = randomNum.nextInt(1, 100);
    intGuess = readInt("Guess the number (1-100): ");

    // Loop until the user guesses correctly
    while (intAnswer != intGuess) {

      // Check if answer is too high
      if (intGuess > intAnswer) {
        System.out.println("Too high, guess again.");
        intGuess = readInt("Guess the number (1-100): ");
      }
      
      // Check if answer is too low
      else if (intGuess < intAnswer) {
        System.out.println("Too low, guess again.");
        intGuess = readInt("Guess the number (1-100): ");       
      }
      
    }
  
    System.out.println("Congratulations!");

  }
}
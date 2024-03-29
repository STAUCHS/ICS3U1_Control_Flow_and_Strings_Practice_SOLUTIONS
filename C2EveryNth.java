class C2EveryNth extends ConsoleProgram {

  /**
  * Program that prints out a string made with character 0 and then every Nth char of the string.
  * @author: C. Chen
  */
  
  public void run() {
    
    // Declare variables
    String strWord;
    int intNthChar;
    String strNewWord;
    
    // Get word from user
    strWord = readLine("Enter a word: ");
    intNthChar = readInt("Enter an integer: ");
    strNewWord = "";

    for (int counter = 0; counter <= strWord.length(); counter += intNthChar) {
      strNewWord += strWord.charAt(counter);
    }

    System.out.println(strNewWord);

  }
}

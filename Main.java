import java.util.Scanner; //imports scanner for user input
class Main { //main class
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in); //scanner input as keyboard
    System.out.println("Hi! Let’s Play Magic 8-Ball!"); //user output
    System.out.print("Ask me a question: "); //user output
    String userInput = keyboard.nextLine(); //user input
    
    int randomInt = (int)(Math.random() * (8 - 1 + 1) + 1); //generates a number between 1 and 8
    if (randomInt == 1){ //if statement if random int equal 1
      System.out.println("Maybe"); //output
    }
    if (randomInt == 2) { //if statement if random int equal 2
      System.out.println("Of course!!"); //output
    }
    if (randomInt == 3) { //if statement if random int equal 3
      System.out.println("No :("); //output
    }
    if (randomInt == 4) { //if statement if random int equal 4
      System.out.println("Perhaps"); //output
    }
    if (randomInt == 5) { //if statement if random int equal 5
      System.out.println("Probably"); //output
    }
    if (randomInt == 6) { //if statement if random int equal 6
      System.out.println("Not a chance"); //output
    }
    if (randomInt == 7) { //if statement if random int equal 7
      System.out.println("Definetly"); //output
    }
    if (randomInt == 8) { //if statement if random int equal 8
      System.out.println("Never"); //output
    }
  }
}

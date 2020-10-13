import java.util.Scanner;
/**
 *Tells user their last digit
 * @author Tolga Nurtekin
 */
public class Main {
  //create method for the final digit of users number
  public static int lastDigit(int userNum){
    int remainder = userNum % 10;
    return remainder;
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner
    Scanner input = new Scanner(System.in);
    //ask user for number
    System.out.println("Enter Number");
    //declare a variable to store users number
    int userNum = input.nextInt();
    //calculate the final number
    int remainder = userNum % 10;
    System.out.println(remainder);
  }
}


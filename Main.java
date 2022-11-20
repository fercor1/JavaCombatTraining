import java.util.*;

public class Main {

  public static void main(String[] args) {
    ArrayList<String> sport = new ArrayList<>();
    System.out.println();
    System.out.println("------------The Combat Training Logger------------");
    System.out.println();

    try {
      Scanner sc = new Scanner(System.in);
      System.out.println("Did you train in boxing or jiu-jitsu today? (please enter 'B' for boxing and 'J' for jiu-jitsu)");
      String userChoice = sc.nextLine();
      String trainingChoice = userChoice.toUpperCase();
      
      switch (trainingChoice) {
        
        case "B":
          System.out.println("What kind of boxing workout did you do?  (ex. sparring, bag work, mitt work, etc.)");
          String boxingTypeChoice = sc.nextLine();
          System.out.println("How many minutes did you box in total?");
          int boxTime = sc.nextInt();
          System.out.println("How many rounds did you get in?");
          int roundNumber = sc.nextInt();
          System.out.println("What was your weight at the end of the workout?");
          int weight = sc.nextInt();
          sport.add(trainingChoice);
          String wt = "";
          
          for (String str : sport) {
            if (boxingTypeChoice.equals(str)) {
              wt += str;
            }
          }
          Boxing box = new Boxing("Boxing", boxTime, roundNumber, weight);
          System.out.println(box);
          System.out.println("Calories Burned: " + box.caloriesBurned());
          System.out.println(box.trainingSummary());
          
          break;
        
        case "J":
          System.out.println("How many minutes did you roll for in total? ");
          int rollTime = sc.nextInt();
          System.out.println("How many people did you roll with?");
          int partners = sc.nextInt();
          System.out.println("How many submissions did you get?");
          int subs = sc.nextInt();
          JiuJitsu roll = new JiuJitsu("Jiu Jitsu", rollTime, partners, subs);
          System.out.println(roll);
          System.out.println("Calories Burned: " + roll.caloriesBurned());
          System.out.println(roll.trainingSummary());
          
          break;
          
        default:
          System.out.println("Your choice was not recognized, please restart and try again.");
      }
      sc.close();
      
    } catch (InputMismatchException e) {
      System.out.println(e);
      System.out.println("Please restart and try again using only whole numbers.");
    }
  }
}
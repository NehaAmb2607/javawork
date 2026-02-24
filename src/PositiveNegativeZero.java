package CodeChallengesForPractice.src;

public class PositiveNegativeZero {
  public static void main(String[] args) {
    int display =checkNumber(12);
    System.out.println(display);

  }

  public static int checkNumber(int number){
      if(number > 0)
      {
          System.out.println("positive");
      }
      else if(number < 0)
      {
          System.out.println("negative");
      }
      else
      {
          System.out.println("zero");
      }
      return number;
  }
}

package CodeChallengesForPractice.src;

public class DecimalComparator {
    public static void main(String[] args)
    {
      boolean result= areEqualByThreeDecimalPlaces(-3.123, 3.123);
      System.out.println(result);
    }
    public static boolean areEqualByThreeDecimalPlaces(double number1,double number2)
    {
        int num1 = (int)(number1*1000);
        int num2 = (int)(number2*1000);
        if(num1==num2)
        {
            return true;
        }
        return false;
    }
}

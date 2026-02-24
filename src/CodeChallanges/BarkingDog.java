package CodeChallengesForPractice.src;

public class BarkingDog {
    public static void main(String args[]) {
        System.out.println("Barking Dog"+shouldWakeUp(true,44));
    }
    public static boolean shouldWakeUp(boolean barking,int hourOfDay)
    {
        if (barking == true && ((hourOfDay >= 0 && hourOfDay < 8)|| (hourOfDay >22 && hourOfDay <= 23)))
        {
            return true;
        }
        else if(barking == false && ((hourOfDay >=0 && hourOfDay < 8)|| (hourOfDay >22 && hourOfDay <= 23)))
        {
            return false;
        }

        else
        {
            return false;
        }
    }
}

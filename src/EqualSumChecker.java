public class EqualSumChecker {
    public static void main(String[] args) {

        boolean test = hasEqualSum(1,-1,0);
        System.out.println(test);
    }
    public static boolean hasEqualSum(int number1,int number2,int number3)
    {
        int result = number1+number2;
        if(result==number3)
        {
            return true;
        }
        return false;
    }
}

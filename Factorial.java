class Factorial{
    public static double factor(int i) {
        double result = 1;
        for(int j = 1; j <= i; j++)
        {
            result = result * j;
        }
        return result;
    }
        }


public class Main {
    public static void main(String[] args) {
        int number = 4;
        System.out.println("The factorial number of " + number + " is: " + Factorial.factor(number));
        

    }

}
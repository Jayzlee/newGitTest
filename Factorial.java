import java.util.Scanner;
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
        System.out.println("Please enter a number: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println("The factorial number of " + number + " is: " + Factorial.factor(number));
        

    }

}
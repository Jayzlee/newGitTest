import java.util.Scanner;
class Fibonacci
{
    public static double fibo(int i)
    {
        double result = 1;
        if (i < 3) {
            return result;
        }
        else
        {
                result = fibo(i - 2) + fibo(i - 1);

            return result;
        }
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter a number: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println("The " + number +  " of the fibonacci list is: " + Fibonacci.fibo(number));
        

    }

}
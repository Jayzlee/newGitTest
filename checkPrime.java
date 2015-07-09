import java.util.Scanner;

class checkPrime{
    public static boolean isPrime(double i) {
        int number = 2;
        int result = 0;
        while(number <= i / 2){
            if(i % number == 0)
            {
                result = 1;
            }
            number++;
        }
        if(result ==1){
            return false;
        }
        else
        {
            return true;
        }
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter a number: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println("Whether " + number + " is Prime? " + "The answer is: "+checkPrime.isPrime(number));

    }

}
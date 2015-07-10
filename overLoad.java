class Table{
    public  void multi(int i){
        int result = 1;
        for(int j = 1; j <= i; j++)
        {
            result = result * j;
        }
        System.out.println("Factorial of " + i + " is: " + result);

    }
    public void multi(int i, int k){
        int result = 0;
        System.out.println("Here is the multiplication table:");
        for(int j = 1; j <= k; j++){
            result = i * j;
            System.out.println( i + " * " + j + " = " + result);
        }

    }
}

public class Main{
    public static void main(String Args[]){
            Table t = new Table();
            t.multi(4);
            t.multi(4,3);
    }
}
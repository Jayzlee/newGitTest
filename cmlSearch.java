public class Main{
    public static void main(String Args[]){
        int number = 5;
        boolean result = false;
        for(int i = 0; i < Args.length; i++){
            if(Integer.parseInt(Args[i]) == number){
                result = true;
            }
        }
        for(int i = 0; i < Args.length; i++){
            if(i == 0){
                System.out.println("The number in command argument are: ");
            }
            System.out.println(Args[i]);
        }
        System.out.println("Whether the command argument contain " + number + "? " + result);
    }
}
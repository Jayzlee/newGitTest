class  validNumber{
        public static boolean isValid(String s){
            int i = 0, n = s.length();
            boolean result = false;
            while(i < n && Character.isWhitespace(s.charAt(i))) i++;    //deal with start whitespace
            if(i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) i++;
            while(i < n && Character.isDigit((s.charAt(i)))) {      //pass the digits before dot
                i++;
                result = true;

            }
            if(i < n && s.charAt(i) == '.'){
                i++;
                while(i<n && Character.isDigit(s.charAt(i))){       //pass the digits after dot
                    i++;
                    result = true;
                    
                }
            }
            while(i < n && Character.isWhitespace(s.charAt(i))) i++;        //deal with trail whitespace
            return result && i == n;    //detect whether it is the trail whitespace to deal with 1. 23 example
        }
}

public class Main{
    public static void main(String Args[]){
        System.out.println(validNumber.isValid(" +1. 23 "));
    }
}
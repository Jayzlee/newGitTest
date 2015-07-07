class strComp{
    public static int strstr(String needle, String hayStack) {
        for(int i = 0; ; i++){
            for(int j = 0; ; j++){
                if(j == needle.length()) return i;
                if(i + j == hayStack.length()) return -1;
                if(needle.charAt(j) != hayStack.charAt(i+j)) break;
            }
        }
    }
        }


public class Main {
    public static void main(String[] args) {
        System.out.println("Result: " + strComp.strstr("ab", "bcabc"));
    }

}
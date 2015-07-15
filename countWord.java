class countWord{
    public int countWord(String s,String w){
        int result = 0;
        for(int i=0;i< s.length() ; i++){
            for(int j = 0;j < w.length(); j++){
                if(w.charAt(j)!= s.charAt(i)){
                    //System.out.println("w: "+ j+ w.charAt(j));
                    //System.out.println("s: "+ i+ s.charAt(i));
                    break;
                }
                i++;
                if(j == w.length() - 1){
                    result++;
                }
            }

        }
        return result;
    }
}

class Main{
    public static void main(String[] args) {
        String s = "Java is a simple programming language but requires programming practice. That is what we are doing now...";
        String tmp1 = "is";
        countWord count = new countWord();
        System.out.println(count.countWord(s, tmp1));

    }
}
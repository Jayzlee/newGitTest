class upperCase{
    public String upperCase(String s){
        StringBuilder result= new StringBuilder();
        for(int i=0;i< s.length(); i++){
            //System.out.println((int)s.charAt(i));
            result.append((char)((int)s.charAt(i)-32));
        }
        return result.toString();
    }
}

class Main{
    public static void main(String[] args) {
        String s = "abc";
        upperCase u = new upperCase();
        System.out.println(u.upperCase(s));

    }
}
class subString{
    public String subString(String s, int a,int b){
        StringBuilder result= new StringBuilder();
        for(int i=a;i<= b; i++){
            result.append(s.charAt(i));
        }
        return result.toString();
    }
}

class Main{
    public static void main(String[] args) {
        String s = "java programming";
        subString sub = new subString();
        System.out.println(sub.subString(s,2,7));

    }
}
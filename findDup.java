class findDup{
    public void findDup(String s){
        int count = 0;
        char[] charList = new char[s.length()];
        char[] charArr = s.toCharArray();
        for(int i=0;i< charArr.length; i++){
            //System.out.println(charArr[i]);
        }
        for(int i=0;i< charArr.length; i++){
            for(int j=i+1; j< charArr.length; j++){
                if(charArr[i] == charArr[j]){
                    charList[count] = charArr[i];
                    count++;
                    //System.out.println(charArr[i]);
                    break;
                }
            }

            }
            for(int i=0;i <=count; i++){
                for(int j=i+1;j<=count; j++){
                    if(charList[i]==charList[j]){
                        break;
                    }
                    if(j== count){
                        System.out.println(charList[i]);
                    }
                }
            }

        }

    }


class Main{
    public static void main(String[] args) {
        String s = "Java is a simple ..";
        findDup count = new findDup();
       count.findDup(s);

    }
}
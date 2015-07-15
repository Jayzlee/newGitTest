class Main{
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        str.append("HelloWorld");
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        str.insert(3,'B');
        System.out.println(str);
        str.replace(3,5,"OOP");
        System.out.println(str);
    }
}
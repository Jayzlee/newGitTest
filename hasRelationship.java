//Has-A Relationship
class Bank{
    String bankName;
    String accountNum;

    Bank(String name, String account){
        this.bankName = name;
        this.accountNum = account;
    }
     public void accountDetails(){
         System.out.println("Bank name is: " + bankName);
         System.out.println("Account number is: " + accountNum);
     }

}
class Customer{
    String customerName;
    Bank account;
    Customer(String name , Bank ba){
        this.customerName = name;
        this.account = ba;
    }
    public void customerDetails(){
        System.out.println("Customer is: " + customerName );
        account.accountDetails();
    }

}
class Main{
    public static void main(String[] args) {
        Bank b = new Bank("Chase", "1375231009");
        Customer c = new Customer("Jay", b);
        c.customerDetails();
    }
}
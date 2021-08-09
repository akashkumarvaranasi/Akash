public class MainClass {
    public static void main(String[] args) {
        BankDetails Customer1 = new BankDetails();
        Customer1.setAccountNumber(1010292198);
        Customer1.setBalance(1000);
        Customer1.setCustomerName("Akash");
        Customer1.setEmail("akash@gmail.com");
        Customer1.setPhoneNumber(912345678);
        System.out.println(Customer1.getAccountNumber());
        System.out.println(Customer1.getBalance());
        Customer1.Deposit(1000);
        System.out.println(Customer1.getBalance());
        Customer1.Withdraw(3000);
        Customer1.Withdraw(1500);
    }


}

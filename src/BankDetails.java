public class BankDetails {
    private int AccountNumber;
    private int Balance;
    private String CustomerName;
    private String Email;
    private int PhoneNumber;

    public int getAccountNumber(){
        return AccountNumber;
    }
    public void setAccountNumber(int acc){
        this.AccountNumber=acc;
    }

    public int getBalance(){
        return Balance;
    }
    public void setBalance(int acc){
        this.Balance=acc;
    }

    public String getCustomerName(){
        return CustomerName;
    }
    public void setCustomerName(String acc){
        this.CustomerName=acc;
    }

    public String getEmail(){
        return Email;
    }
    public void setEmail(String acc){
        this.Email=acc;
    }


    public int getPhoneNumber(){
        return PhoneNumber;
    }
    public void setPhoneNumber(int acc){
        this.PhoneNumber=acc;
    }
    protected void Deposit(int money){
        this.Balance = this.Balance+money;
        System.out.println("Your Remaining Balance is "+ this.Balance);
    }

    protected void Withdraw(int money){
        if(money>this.Balance){
            System.out.println("Insuffient Funds: Not possible");
            return;
        }
        this.Balance = this.Balance-money;
        System.out.println("Your Remaining Balance after withdrawal is "+ this.Balance);
    }
}

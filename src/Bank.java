public class Bank {
    public String bankName;
    public BankDetails customer;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public BankDetails getCustomer() {
        return customer;
    }

    public void setCustomer(BankDetails customer) {
        this.customer = customer;
    }

}
public class Account {

    private String owner;
    private String iban;
    private String bic;
    private double balance;
    private int accountID;
    private static int uniqueID = 1;


    public Account (String owner, String iban, String bic) {
        this.owner = owner;
        this.iban = iban;
        this.bic = bic;
        this.balance = 0.0;
        this.accountID = uniqueID;
        uniqueID = uniqueID +1;
    }

    public int getAccountID() {
        return this.accountID;
    }

    public void add (double wert) {
        this.balance = this.balance + wert;
    }

    public void deposit (double wert) {
        if (this.balance - wert >= 0) {
            this.balance = this.balance - wert;
        } else {
            System.out.println("Sie sind dabei Ihr Limit zu überschreiten!");
        }
    }

    public double getBalance() {
        return this.balance;
    }




}

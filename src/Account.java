public class Account {

    private String owner;
    private String iban;
    private String bic;
    private double balance;

    public Account (String owner, String iban, String bic) {
        this.owner = owner;
        this.iban = iban;
        this.bic = bic;
        this.balance = 0.0;
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

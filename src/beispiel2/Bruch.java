package beispiel2;

public class Bruch {
    private int numerator;
    private int denominator;
    private int fractionID;
    private static int number = 1;

    //public String toString() {
    //    return fractionID;
    //}

    public Bruch(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        this.fractionID = number;
        number = number + 1;

    }

    public int getFractionID() {
        return fractionID;
    }

    public static int getAnzahlBrueche() {
        return number - 1;
    }

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public double toDecimal() {
        return (double) this.numerator / (double) this.denominator;
    }

    public void print() {
        System.out.println(this.numerator + " / " + this.denominator);
    }

    public Bruch multiply(Bruch b2) {
        Bruch b2a = new Bruch(1, 1);
        b2a.numerator = b2.numerator * b2.numerator;
        b2a.denominator = b2.denominator * b2.denominator;
        return b2a;
    }

    public Bruch multiply(Bruch b2, Bruch b3) {
        Bruch b3a = new Bruch(1, 1);
        b3a.numerator = b2.numerator * b3.numerator * b2.numerator;
        b3a.denominator = b2.denominator * b3.denominator * b2.denominator;
        return b3a;
    }

    public Bruch add(Bruch b2) {
        Bruch b4a = new Bruch(1,1);
        b4a.numerator = b2.numerator + b2.numerator;
        b4a.denominator = b2.denominator;
        return b4a;
    }

}

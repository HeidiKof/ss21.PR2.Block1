package beispiel2;

public class BruchDemo {
    public static void main(String[] args) {
        Bruch b2 = new Bruch(5,7);
        b2.print();
        System.out.println(b2.toDecimal());
        Bruch b3 = new Bruch(2,3);
        b3.print();
        System.out.println(b3.toDecimal());

        b2.multiply(b2).print();

        b2.multiply(b2,b3).print();

        b2.add(b2).print();
        b3.add(b3).print();
        b2.add(b3).print();


        Bruch b4 = new Bruch(3,7);

        System.out.println(b2.getFractionID());
        System.out.println(b3.getFractionID());
        System.out.println(b4.getFractionID());

        System.out.println(Bruch.getAnzahlBrueche());
        Bruch.getAnzahlBrueche().

    }
}

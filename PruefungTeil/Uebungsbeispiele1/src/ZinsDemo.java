public class ZinsDemo {
    public static void main(String[] args) {

        double kontostand1 = 1000;
        double zinssatz1 = 2.25;

        System.out.println("Die Zinsen für ein Jahr betragen " + zinsen(kontostand1, zinssatz1) + " €.");

        double kontostand2 = 1500;
        double zinssatz2 = 2.3;

        System.out.println("Die Zinsen für ein Jahr betragen " + zinsen(kontostand2, zinssatz2) + " €.");

        double kontostand3 = 2000;
        double zinssatz3 = 3.0;

        System.out.println("Die Zinsen für ein Jahr betragen " + zinsen(kontostand3, zinssatz3) + " €.");

    }
    public static double zinsen (double kontostand, double zinssatz) {
        return kontostand * zinssatz / 100;
    }
}

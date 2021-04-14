public class DistanceDemo {
    public static void main(String[] args) {

        int kilometerValue = 10;

        System.out.println(kilometerValue + " Kilometer sind " + kilometerToMiles(kilometerValue) + " Meilen.");

        System.out.println(kilometerToMiles(kilometerValue) + " Meilen sind " + milesToKilometer(kilometerToMiles(kilometerValue)) + " Kilometer.");
    }
    public static double kilometerToMiles(int kilometer) {
        return kilometer * 0.6214;
    }

    public static double milesToKilometer(double miles) {
        return miles / 0.6214;
    }
}

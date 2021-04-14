public class NotenDemo {
    public static void main(String[] args) {

        System.out.println("Erreichte Punkte: " + 95 + " - Ihre Note ist " + getNotentext(95));
        System.out.println("Erreichte Punkte: " + 85 + " - Ihre Note ist " + getNotentext(85));
        System.out.println("Erreichte Punkte: " + 75 + " - Ihre Note ist " + getNotentext(75));
        System.out.println("Erreichte Punkte: " + 60 + " - Ihre Note ist " + getNotentext(60));
        System.out.println("Erreichte Punkte: " + 42 + " - Ihre Note ist " + getNotentext(42));
        System.out.println("Erreichte Punkte: " + 120 + " - Ihre Note ist " + getNotentext(120));

    }
    public static String getNotentext(int punkte) {
        if (punkte >= 90 && punkte <= 100) {
            return "Sehr Gut";
        } else if (punkte >= 78 && punkte <= 89) {
            return "Gut";
        } else if (punkte >= 65 && punkte <= 77) {
            return "Befriedigend";
        } else if (punkte >= 51 && punkte <= 64) {
            return "Genügend";
        } else if (punkte >= 0 && punkte <= 50) {
            return "Nicht Genügend";
        } else
            return "Ungültige Eingabe!";
    }
}

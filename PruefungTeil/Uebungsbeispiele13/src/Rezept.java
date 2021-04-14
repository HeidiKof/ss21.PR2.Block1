public class Rezept {

    int anzahlPersonen;
    String[] zutatenName;
    double[][] zutaten;

    public boolean allergisch(String zutat) {
        for (int i = 0; i < zutatenName.length; i++) {
            if (zutat.equals(zutatenName[i])) {
                return true;
            }
        }
        return false;
    }

    public boolean laktoseFrei() {
        for (int i = 0; i < zutatenName.length; i++) {
            if (zutatenName[i].equals("Milch")) {
                zutaten[i] = 0;
                return true;
            }

        } return false;
    }

    public double kostet() {
        double sum = 0;

        for (int i = 0; i < zutaten.length; i++) {
            sum = sum + zutaten[]
        }
        return sum;
    }

    public double kostetProPerson() {
        return kostet() / anzahlPersonen;
    }


}

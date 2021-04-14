public class WinterreifenpflichtDemo {
    public static void main(String[] args) {

        int temp1 = 9;
        boolean fahrbahn1 = true;

        if (isWinterreifenPflicht(temp1,fahrbahn1) == true) {
            System.out.println("Bitte Winterreifen verwenden!");
        } else {
            System.out.println("Winterreifen sind nicht erforderlich.");
        }

        int temp2 = 7;
        boolean fahrbahn2 = false;

        if (isWinterreifenPflicht(temp2,fahrbahn2) == true) {
            System.out.println("Bitte Winterreifen verwenden!");
        } else {
            System.out.println("Winterreifen sind nicht erforderlich.");
        }

        int temp3 = 3;
        boolean fahrbahn3 = false;

        if (isWinterreifenPflicht(temp3,fahrbahn3) == true) {
            System.out.println("Bitte Winterreifen verwenden!");
        } else {
            System.out.println("Winterreifen sind nicht erforderlich.");
        }

        int temp4 = 12;
        boolean fahrbahn4 = true;

        if (isWinterreifenPflicht(temp4,fahrbahn4) == true) {
            System.out.println("Bitte Winterreifen verwenden!");
        } else {
            System.out.println("Winterreifen sind nicht erforderlich.");
        }

    }
        public static boolean isWinterreifenPflicht ( int temperatur, boolean rutschigeFahrbahn){
            if (temperatur < 4) {
                return true;
            } else if (temperatur < 10 && rutschigeFahrbahn == true) {
                return true;
            } else
                return false;
        }
    }


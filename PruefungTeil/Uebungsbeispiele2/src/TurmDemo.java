public class TurmDemo {
    public static void main(String[] args) {

     int start = 2;

     for (int i = 1; i <= 9; i++) {
         start = start * i;
         System.out.println(start);
     }
     for (int j = 1; j <= 9; j++) {
         start = start / j;
         System.out.println(start);
     }


    }
}

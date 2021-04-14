public class Bank {
    public static void main(String[] args) {

        Account a1 = new Account("Ada Lovelace", "AT38 1234 5678 9012 3456", "BKAUATWW");
        Account b2 = new Account("Hedy Lamarr", "AT38 0987 6543 2109 8765", "BKAUATWW");
        Account c3 = new Account("Katherine Johnson", "AT38 7890 1234 5678 9098", "BKAUATWW");

        Account [] arr = new Account[3];
        arr[0] = a1;
        arr[1] = b2;
        arr[2] = c3;

        a1.add(100000);
        System.out.println(a1.getBalance());
        a1.deposit(100001);
        System.out.println(a1.getBalance());
        a1.deposit(500);
        System.out.println(a1.getBalance());

        b2.add(50250);

        c3.add(7777777);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getBalance());
        }

    }
}

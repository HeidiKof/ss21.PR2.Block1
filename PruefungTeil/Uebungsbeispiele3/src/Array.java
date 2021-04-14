import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        int[] arr = {8, 5, 1, 9, 0, 4};

        System.out.println(Arrays.toString(arr));

        arrangeOrder(arr);

        System.out.println(Arrays.toString(arr));


        int[] arr2 = {1, 5, 1, 9, 4, 0};

        System.out.println(Arrays.toString(arr2));

        arrangeOrder(arr2);

        System.out.println(Arrays.toString(arr2));

    }

    public static void arrangeOrder(int[] numbers) {
        int sub = 0;

        for (int x = 0; x <= numbers.length; x++)
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    sub = numbers[i + 1];
                    numbers[i + 1] = numbers[i];
                    numbers[i] = sub;
                }
            }

    }
}

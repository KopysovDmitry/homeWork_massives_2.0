import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int sum = 0;
        int min =0;
        int max =0;
        double mean =0;
        double numberArr = 0;
        int[] arr = generateRandomArray();

        //masives lesson 2 task 1//
        for (int i:arr) {
            sum += i;
        }
        System.out.println("Сумма всех выплат за месяц: " + sum);

        //masives lesson 2 task 2//
        for (int i = 0; i < arr.length-1; i++) {

            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max +" рублей");

        //masives lesson 2 task 3//
        for (int i = 0; i < arr.length; i++) {
            mean += (double) arr[i]/arr.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + mean + " рублей");

        //masives lesson 2 task 4//

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int x = reverseFullName.length;
        char temp;
        for (int i = 0; i < x/2; i++){
            temp = reverseFullName[x - i - 1];
            reverseFullName[x - i - 1] = reverseFullName[i];
            reverseFullName[i] = temp;
        }
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[i]);
        }

    }
        public static int[] generateRandomArray () {

            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
            }
            return arr;
        }

    }


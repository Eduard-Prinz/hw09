public class Main {
    public static void main(String[] args) {

        //task1 ();
        //task2 ();
        //task3 ();
        task4 ();
        //task5 ();
        //task6 ();
        //task7 ();
        //task8 ();

    }

    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    //1
    public static void task1 () {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + "руб");
    }

    public static void task2 () {
        int[] arr = generateRandomArray();
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + "руб. Максимальная сумма трат за день составила " + max + "руб");
    }

    public static void task3 () {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double average = (double) sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
    }

    public static void task4 () {
        char[] reverseFullName = {'z', 'n', 'i', 'r', 'P', ' ', 'd', 'r', 'a', 'u', 'd', 'E'};
        System.out.print("Имя и фамилия сотрудника: ");
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            if (reverseFullName[i] == ' ') {
                System.out.print(" ");
            } else {
                System.out.print(reverseFullName[i]);
            }
        }
    }
}
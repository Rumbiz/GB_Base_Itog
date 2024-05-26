import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите элементы массива через пробел:");
        String[] arr = scanner.nextLine().split(" ");

        String[] filteredArr = filterShortStrings(arr);
        for (String str : filteredArr) {
            System.out.print(str + " ");
        }
    }

    private static String[] filterShortStrings(String[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() <= 3) {
                count++;
            }
        }
        String[] result = new String[count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() <= 3) {
                result[j++] = arr[i];
            }
        }
        return result;
    }
}

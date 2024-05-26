import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Фаза 2: Ввод массива строк
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите элементы массива через пробел:");
        String[] arr = scanner.nextLine().split(" ");

        // Фаза 3: Итерация по элементам массива
        String[] filteredArr = new String[arr.length]; // Предварительное выделение места под результат
        int index = 0;
        for (String s : arr) {
            // Фаза 4: Проверка длины элемента
            if (s.length() <= 3) {
                // Фаза 5: Добавление в новый массив
                filteredArr[index++] = s;
            }
        }

        // Фаза 6: Вывод результата
        for (String s : filteredArr) {
            if (s!= null) { // Проверяем, не пуст ли массив
                System.out.print(s + " ");
            }
        }
    }
}

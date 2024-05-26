using System;

class Program {
    static void Main(string[] args) {
        Console.WriteLine("Введите элементы массива через пробел:");
        string[] arr = Console.ReadLine().Split(' ');

        string[] filteredArr = FilterShortStrings(arr);
        foreach (var str in filteredArr) {
            Console.Write($"{str} ");
        }
    }

    private static string[] FilterShortStrings(string[] arr) {
        List<string> result = new List<string>();
        foreach (var item in arr) {
            if (item.Length <= 3) {
                result.Add(item);
            }
        }
        return result.ToArray();
    }
}

def filter_short_strings(arr):
    # Фаза 3: Итерация по элементам массива
    filtered_arr = []
    for s in arr:
        # Фаза 4: Проверка длины элемента
        if len(s) <= 3:
            # Фаза 5: Добавление в новый массив
            filtered_arr.append(s)
    # Фаза 6: Вывод результата
    print(filtered_arr)

# Фаза 2: Ввод массива строк
arr = input("Введите элементы массива через пробел: ").split()

filter_short_strings(arr)

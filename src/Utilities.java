public abstract class Utilities {

    static int maxMultOfThreeNumbers(int[] pArray) {
        // Создаем клон массива для предотвращения изменения оригинального массива
        int[] array = pArray.clone();

        // Сортировка локального массива по возврастанию
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        // Сравнение произвдения двух наибольших отрицательных чисел и двух наибольших положительных чисел
        if (array[0] * array[1] > array[array.length - 1] * array[array.length - 2]) {
            // если произвдение двух наибольших отрицательных чисел больше, то
            return array[0] * array[1] * array[array.length - 1];
        } else {
            return array[array.length - 1] * array[array.length - 2] * array[array.length - 3];
        }
    }
}

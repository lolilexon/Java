import java.util.Scanner;

//Задача 1: Четное или нечетное число
//Условие:
//Пользователь вводит целое число. Программа должна вывести, является ли это число четным или нечетным.
/*
public static void main(String[] args) {
    int number = 15;

    if (number % 2 == 0) {
        System.out.println(number + " это четное число");
    } else {
        System.out.println(number + " это нечетное число");
    }
}
*/
//Задача 2: Минимальное из трех чисел
//Условие:
//Пользователь вводит три целых числа. Программа должна найти и вывести минимальное из них.
/*
public static void main(String[] args) {
    int[] numbers = {4, 2, 3};
    System.out.println("Минимальное число: " + Arrays.stream(numbers).min().orElseThrow());
}
*/
//Задача 3: Таблица умножения
//Условие:
//Напишите программу, которая выводит таблицу умножения на 5 (от 1 до 10).
/*
public static void main(String[] args) {
    for(int i = 1; i <= 10; i++) {
        System.out.println("5 * " + i + " = " + 5 * i);
    }
}
*/
//Задача 4: Сумма чисел от 1 до N
//Условие:
//Пользователь вводит целое число N. Программа должна вывести сумму всех чисел от 1 до N.
/*
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите количество чисел в массиве: ");
    int length = scanner.nextInt();

    int num = 0;

    for(int i = 1; i <= length; i++) {
        num += i;
    }
    System.out.print("Cумма всех чисел от 1 до " + length + " = " + num);
}
*/
//Задача 5: Число Фибоначчи
//Условие:
//Пользователь вводит целое число N. Программа должна вывести первые N чисел Фибоначчи.
/*
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Сколько первых чисел Фибоначчи вы хотите вывести?: ");
    int length = scanner.nextInt();
    int a = 0, b = 1, c;
    for (int i = 2; i <= length+1; i++) {
        c = a + b;
        a = b;
        b = c;
        System.out.println(b);
    }

}
*/
//Задача 6: Проверка простого числа
//Условие:
//Пользователь вводит целое число. Программа должна проверить, является ли это число простым (делится только на 1 и само на себя).



//Задача 7: Обратный порядок чисел
//Условие:
//Пользователь вводит целое число N. Программа должна вывести числа от N до 1 в обратном порядке.
/*
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Вывод числа от N до 1 в обратном порядке, введите N: ");
    int length = scanner.nextInt();

    for (int i = length; i >= 1; i--) {
        System.out.println(i);
    }
}
*/
//Задача 8: Сумма четных чисел
//Условие:
//Пользователь вводит два целых числа A и B. Программа должна найти сумму всех четных чисел в диапазоне от A до B (включительно).
/*
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введие число А: ");
    int a = scanner.nextInt();

    System.out.print("Введие число B: ");
    int b = scanner.nextInt();

    for (int i = a; i <= b; i++) {
        if (i % 2 == 0) {
            System.out.println(i);
        }
    }
}
*/
//Задача 9: Реверс строки
//Условие:
//Пользователь вводит строку. Программа должна вывести эту строку в обратном порядке.
/*
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введие строку: ");
    String a = scanner.nextLine();

    for (int i = a.length() - 1; i >= 0; i--) {
    System.out.print(a.charAt(i));
    }
}
*/
//Задача 10: Количество цифр в числе
//Условие:
//Пользователь вводит целое число. Программа должна вывести количество цифр в этом числе.
/*
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введие число: ");
    int a = scanner.nextInt();

    Integer.toString(a);

    System.out.println(Integer.toString(a).length());
}
*/
//Задача 11: Факториал числа
//Условие:
//Пользователь вводит целое число N. Программа должна вычислить факториал этого числа (N!).
/*
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введие число: ");
    int a = scanner.nextInt();
    int result = 1;
    for (int i = 1; i <= a; i++) {
        result *= i;
    }
    System.out.println(result);
}
*/
//Задача 12: Сумма цифр числа
//Условие:
//Пользователь вводит целое число. Программа должна найти сумму всех цифр этого числа.
/*
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введие число: ");
    int a = scanner.nextInt();

    String a2 = Integer.toString(a);
    int result = 0;

    for(int i = 0; i < a2.length(); i++) {
        result += Integer.parseInt(a2.substring(i, i + 1));
    }
    System.out.println(result);
}
*/
//Задача 13: Палиндром
//Условие:
//Пользователь вводит строку. Программа должна проверить, является ли эта строка палиндромом (читается одинаково слева направо и справа налево).
/*
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введие слово для проверки на палиндром: ");
    String str = scanner.nextLine();

    int left = 0;
    int right = str.length() - 1;
    boolean res = true;

    while (left < right) {
        if (str.charAt(left) != str.charAt(right)) {
            res = false;
        }
        left++;
        right--;
    }
    if (res == false) {
        System.out.println("Строка не является палиндромом.");
    }
    else {
        System.out.println("Строка является палиндромом.");
    }
}
*/
//Задача 14: Найти максимальное число в массиве
//Условие:
//Пользователь вводит размер массива и элементы массива. Программа должна найти и вывести максимальное число в массиве.
/*
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введие размер массива: ");
    int num = scanner.nextInt();
    int[] numbers = new int[num];

    for (int i = 0; i < num; i++) {
        numbers[i] = scanner.nextInt();
    }

    for (int i = 0; i < num; i++) {
        System.out.println("Ваш массив: " + numbers[i]);
    }
}
*/
//Задача 15: Сумма всех элементов массива
//Условие:
//Пользователь вводит размер массива и его элементы. Программа должна вычислить и вывести сумму всех элементов массива.
/*
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введие размер массива: ");
    int num = scanner.nextInt();
    int[] numbers = new int[num];
    int result = 0;

    for (int i = 0; i < num; i++) {
        numbers[i] = scanner.nextInt();
    }

    for (int i = 0; i < num; i++) {
        result += numbers[i];
    }
    System.out.println(result);
}
*/
//Задача 16: Количество положительных и отрицательных чисел
//Условие:
//Пользователь вводит размер массива и его элементы. Программа должна подсчитать и вывести количество положительных и отрицательных чисел в массиве.
/*
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введие размер массива: ");
    int num = scanner.nextInt();
    int[] numbers = new int[num];
    int countPlus = 0;
    int countMinus = 0;

    for (int i = 0; i < num; i++) {
        numbers[i] = scanner.nextInt();
    }

    for (int i = 0; i < num; i++) {
        if (numbers[i] > 0) {
            countPlus++;
        }
        if (numbers[i] < 0) {
            countMinus++;
        }
    }
    System.out.println("Количество положительных чисел в массиве: " + countPlus + "\nКоличество отрицательных чисел в массиве: " + countMinus);
}
*/
//Задача 17: Простые числа в диапазоне
//Условие:
//Пользователь вводит два целых числа A и B. Программа должна вывести все простые числа в этом диапазоне (включительно).
/*
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введие число А: ");
    int a = scanner.nextInt();

    System.out.print("Введие число B: ");
    int b = scanner.nextInt();
    boolean check = true;

    for (int i = a; i <= b; i++) {
        if (i <= 1) {
            check = false;
        }
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                check = false;
            }
        }
        if (check == true){
        System.out.println(i);
        }
        check = true;
    }
}
*/
//Задача 18: Подсчет гласных и согласных в строке
//Условие:
//Пользователь вводит строку. Программа должна подсчитать и вывести количество гласных и согласных букв в этой строке.
/*
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введие слово: ");
    String str = scanner.nextLine();

    int vowelCount = 0;
    int consonantCount = 0;
    String vowel = "аеёиоуыэюя";
    String consonant = "бвгджзйклмнпрстфхцчшщ";

    for (int i = 0; i < str.length(); i++) {
        for (int j = 0; j < vowel.length(); j++) {
            if (str.charAt(i) == vowel.charAt(j)) {
                vowelCount++;
            }
        }
        for (int j = 0; j < consonant.length(); j++) {
            if (str.charAt(i) == consonant.charAt(j)) {
                consonantCount++;
            }
        }
    }
    System.out.println("Количесвто гласных: " + vowelCount + "\nКоличество согласных: " + consonantCount);
}
*/
//Задача 19: Перестановка слов в строке
//Условие:
//Пользователь вводит строку, состоящую из нескольких слов. Программа должна вывести слова в обратном порядке.
/*
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введие предложение: ");
    String str = scanner.nextLine();

    String[] result = str.split(" ");
    for(int i = result.length - 1; i >= 0; i--) {
        System.out.println(result[i]);
    }
}
*/
//Задача 20: Число Армстронга
//Условие:
//Пользователь вводит целое число. Программа должна проверить, является ли это число числом Армстронга (сумма цифр в степени, равной количеству цифр, равна самому числу).
/*
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int number = scanner.nextInt();
        scanner.close();

        if (isArmstrongNumber(number)) {
            System.out.println(number + " является числом Армстронга.");
        } else {
            System.out.println(number + " не является числом Армстронга.");
        }
    }

    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int numberOfDigits = String.valueOf(number).length();
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numberOfDigits);
            number /= 10;
        }

        return sum == originalNumber;
    }
}
 */
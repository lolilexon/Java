import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

class Program {

    // Главный метод программы
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();

            int choice = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера

            switch (choice) {
                case 1:
                    encryptString(scanner);
                    break;

                case 2:
                    decryptString(scanner);
                    break;

                case 3:
                    encryptFile(scanner);
                    break;

                case 4:
                    decryptFile(scanner);
                    break;

                case 5:
                    decryptFileWithBruteForce(scanner);
                    break;

                case 6:
                    bruteForceString(scanner);
                    break;

                case 7:
                    System.out.println("Выход из программы...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Неверный выбор.");
                    break;
            }
        }
    }

    // Метод для отображения главного меню
    private static void displayMenu() {
        System.out.println("Программа шифрования с использованием шифра Цезаря запущена");
        System.out.println("\nВыберите действие:");
        System.out.println("1. Шифровать строку");
        System.out.println("2. Расшифровать строку с использованием ключа");
        System.out.println("3. Шифровать файл");
        System.out.println("4. Расшифровать файл с использованием ключа");
        System.out.println("5. Расшифровать файл с использованием Brute Force");
        System.out.println("6. Brute Force для строки");
        System.out.println("7. Выйти");
    }

    // Метод для шифрования строки
    private static void encryptString(Scanner scanner) {
        System.out.println("Введите строку для шифрования: ");
        String textToEncrypt = scanner.nextLine();

        int alphabetChoice = selectAlphabet(scanner);

        if (alphabetChoice == 1) {
            processEncryption(scanner, textToEncrypt, 32);
        } else if (alphabetChoice == 2) {
            processEncryption(scanner, textToEncrypt, 26);
        } else {
            System.out.println("Неверный выбор.");
        }
    }

    // Метод для расшифровки строки с использованием ключа
    private static void decryptString(Scanner scanner) {
        System.out.println("Введите строку для расшифрования: ");
        String textToDecrypt = scanner.nextLine();

        int alphabetChoice = selectAlphabet(scanner);

        if (alphabetChoice == 1) {
            processDecryption(scanner, textToDecrypt, 32);
        } else if (alphabetChoice == 2) {
            processDecryption(scanner, textToDecrypt, 26);
        } else {
            System.out.println("Неверный выбор.");
        }
    }

    // Метод для шифрования файла
    private static void encryptFile(Scanner scanner) {
        System.out.println("Введите путь к файлу для шифрования: ");
        String inputFilePath = scanner.nextLine();

        System.out.println("Введите путь для сохранения зашифрованного файла: ");
        String outputFilePath = scanner.nextLine();

        int alphabetChoice = selectAlphabet(scanner);

        System.out.println("Введите сдвиг: ");
        int shift = scanner.nextInt();

        try {
            String content = new String(Files.readAllBytes(Paths.get(inputFilePath)), StandardCharsets.UTF_8);
            String encryptedContent;

            if (alphabetChoice == 1 && shift >= 0 && shift <= 32) {
                encryptedContent = caesarCipher(content, shift, 32);
            } else if (alphabetChoice == 2 && shift >= 0 && shift <= 25) {
                encryptedContent = caesarCipher(content, shift, 26);
            } else {
                System.out.println("Неверный сдвиг или язык.");
                return;
            }

            Files.write(Paths.get(outputFilePath), encryptedContent.getBytes(StandardCharsets.UTF_8));
            System.out.println("Файл успешно зашифрован и сохранен по пути: " + outputFilePath);
        } catch (IOException e) {
            System.out.println("Произошла ошибка при работе с файлом: " + e.getMessage());
        }
    }

    // Метод для расшифровки файла с использованием ключа
    private static void decryptFile(Scanner scanner) {
        System.out.println("Введите путь к файлу для расшифрования: ");
        String inputFilePath = scanner.nextLine();

        System.out.println("Введите путь для сохранения расшифрованного файла: ");
        String outputFilePath = scanner.nextLine();

        int alphabetChoice = selectAlphabet(scanner);

        System.out.println("Введите сдвиг: ");
        int shift = scanner.nextInt();

        try {
            String content = new String(Files.readAllBytes(Paths.get(inputFilePath)), StandardCharsets.UTF_8);
            String decryptedContent;

            if (alphabetChoice == 1 && shift >= 0 && shift <= 32) {
                decryptedContent = caesarCipher(content, -shift, 32);
            } else if (alphabetChoice == 2 && shift >= 0 && shift <= 25) {
                decryptedContent = caesarCipher(content, -shift, 26);
            } else {
                System.out.println("Неверный сдвиг или язык.");
                return;
            }

            Files.write(Paths.get(outputFilePath), decryptedContent.getBytes(StandardCharsets.UTF_8));
            System.out.println("Файл успешно расшифрован и сохранен по пути: " + outputFilePath);
        } catch (IOException e) {
            System.out.println("Произошла ошибка при работе с файлом: " + e.getMessage());
        }
    }

    // Метод для расшифровки файла методом подбора ключа (brute force)
    public static void decryptFileWithBruteForce(Scanner scanner) {
        System.out.println("Введите путь к файлу для расшифрования: ");
        String inputFilePath = scanner.nextLine();
        System.out.println("Введите путь для сохранения расшифрованных данных: ");
        String outputFilePath = scanner.nextLine();

        int alphabetChoice = selectAlphabet(scanner);
        int alphabetLength = (alphabetChoice == 1) ? 33 : 26;

        try {
            String content = new String(Files.readAllBytes(Paths.get(inputFilePath)), StandardCharsets.UTF_8);
            StringBuilder outputContent = new StringBuilder();

            for (int shift = 1; shift < alphabetLength; shift++) {
                String decryptedContent = caesarCipher(content, -shift, alphabetLength);
                outputContent.append("Ключ = ").append(shift).append("\n")
                        .append("\"").append(decryptedContent).append("\"\n\n");
            }

            Files.write(Paths.get(outputFilePath), outputContent.toString().getBytes(StandardCharsets.UTF_8));
            System.out.println("Файл успешно расшифрован методом подбора ключа и сохранен по пути: " + outputFilePath);
        } catch (IOException e) {
            System.out.println("Произошла ошибка при работе с файлом: " + e.getMessage());
        }
    }

    // Метод для расшифровки строки методом подбора ключа (brute force)
    private static void bruteForceString(Scanner scanner) {
        System.out.println("Введите строку для расшифровки методом подбора ключа: ");
        String textToDecrypt = scanner.nextLine();

        int alphabetChoice = selectAlphabet(scanner);

        if (alphabetChoice == 1) {
            decryptBruteForce(textToDecrypt, 33);
        } else if (alphabetChoice == 2) {
            decryptBruteForce(textToDecrypt, 26);
        } else {
            System.out.println("Неверный выбор.");
        }
    }

    // Метод для расшифровки строки методом подбора ключа с выводом всех вариантов
    public static void decryptBruteForce(String encryptedText, int alphabetLength) {
        for (int shift = 1; shift < alphabetLength; shift++) {
            String decryptedText = caesarCipher(encryptedText, -shift, alphabetLength);
            System.out.println("Сдвиг " + shift + ": " + decryptedText);
        }
    }

    // Метод для выбора алфавита
    private static int selectAlphabet(Scanner scanner) {
        System.out.println("Выберите язык:\n1. Русский\n2. Английский");
        return scanner.nextInt();
    }

    // Метод для обработки шифрования строки
    private static void processEncryption(Scanner scanner, String text, int alphabetLength) {
        System.out.println("Введите сдвиг: ");
        int shift = scanner.nextInt();
        if (shift >= 0 && shift < alphabetLength) {
            System.out.println("Ваш зашифрованный текст: " + caesarCipher(text, shift, alphabetLength));
        } else {
            System.out.println("Сдвиг должен быть положительным числом, не больше " + (alphabetLength - 1) + " включительно");
        }
    }

    // Метод для обработки расшифровки строки
    private static void processDecryption(Scanner scanner, String text, int alphabetLength) {
        System.out.println("Введите сдвиг: ");
        int shift = scanner.nextInt();
        if (shift >= 0 && shift < alphabetLength) {
            System.out.println("Ваш расшифрованный текст: " + caesarCipher(text, -shift, alphabetLength));
        } else {
            System.out.println("Сдвиг должен быть положительным числом, не больше " + (alphabetLength - 1) + " включительно");
        }
    }

    // Основной метод шифрования и расшифровки с использованием шифра Цезаря
    public static String caesarCipher(String text, int shift, int alphabetLength) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c >= 'a' && c <= 'z') {
                result.append(shiftChar(c, shift, 'a', 26));
            } else if (c >= 'A' && c <= 'Z') {
                result.append(shiftChar(c, shift, 'A', 26));
            } else if (c >= 'а' && c <= 'я') {
                result.append(shiftChar(c, shift, 'а', 33));
            } else if (c >= 'А' && c <= 'Я') {
                result.append(shiftChar(c, shift, 'А', 33));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    // Метод для сдвига символов
    public static char shiftChar(char c, int shift, char base, int alphabetLength) {
        return (char) (((c - base + shift + alphabetLength) % alphabetLength) + base);
    }
}
import java.util.Scanner;

public class App {

    public void run() {
        // Создаем объект Scanner для чтения ввода пользователя
        Scanner scanner = new Scanner(System.in);  // Инициализация сканера

        boolean repeat = true;
        System.out.println("---------------JKTV23 библиотека --------------");
        do {
            System.out.println("Список задач: ");
            System.out.println("0. Выход из программы");
            System.out.println("1. Добавить книгу");
            System.out.println("2. Добавить читателя");
            System.out.println("3. Список книг");
            System.out.println("4. Список читателей");
            System.out.println("5. Выдать книгу");
            System.out.println("6. Вернуть книгу");
            System.out.println("Выберите задачи из списка: ");

            // Чтение ввода с помощью Scanner
            int task = Integer.parseInt(scanner.nextLine());

            switch (task) {
                case 0:
                    repeat = false;
                    break;
                case 1:
                    System.out.println("Добавление книги...");
                    break;
                case 2:
                    System.out.println("Добавление читателя...");
                    break;
                case 3:
                    System.out.println("Список книг...");
                    break;
                case 4:
                    System.out.println("Список читателей...");
                    break;
                case 5:
                    System.out.println("Выдача книги...");
                    break;
                case 6:
                    System.out.println("Возврат книги...");
                    break;
                default:
                    System.out.println("Выберите номер задачи из списка!");
            }
        } while (repeat);

        System.out.println("Good bye!");
        scanner.close();  // Закрытие сканера после завершения программы
    }
}

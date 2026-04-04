package ru.dataBase.student.view;

import ru.dataBase.student.controller.StudentController;
import ru.dataBase.student.dto.DeleteStudentDTO;
import ru.dataBase.student.dto.GetStudentDTO;
import ru.dataBase.student.dto.SaveStudentDTO;
import ru.dataBase.student.util.DateUtils;

import java.time.LocalDate;
import java.util.Scanner;



//Изменить то стринг для гет сдудент и поменя сообщени о ошибке при форматировании даты
public class StudentView {

    private static final StudentController controller = new StudentController();
    private static final Scanner scanner = new Scanner(System.in);

    public static void runInterface() {
        while (true) {
            printMenu();

            try {
                int choice = Integer.parseInt(scanner.nextLine().trim());

                switch (choice) {
                    case 1 -> findStudent();
                    case 2 -> deleteStudent();
                    case 3 -> addStudent();
                    case 4 -> {
                        System.out.println("Программа завершена. До свидания!");
                        return; // выход из метода и завершение программы
                    }
                    default -> System.out.println("Ошибка: Введите число от 1 до 4.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Введите корректное число!");
            }

            System.out.println();
        }
    }

    private static void printMenu() {
        System.out.println("-------------------------------------------------------");
        System.out.println("1. Найти студента по паспорту");
        System.out.println("2. Удалить студента");
        System.out.println("3. Добавить нового студента");
        System.out.println("4. Завершить работу");
        System.out.println("-------------------------------------------------------");
        System.out.print("Выберите действие (1-4): ");
    }


    //ОЖИДАНИЕ ENTER
    private static void waitForEnter() {
        System.out.print("\nНажмите Enter для возврата в меню...");
        scanner.nextLine();   // просто ждём нажатия Enter
    }
    //ПОИСК СТУДЕНТА
    private static void findStudent() {
        System.out.print("Введите серию паспорта (4 символа): ");
        String seria = scanner.nextLine().trim();

        System.out.print("Введите номер паспорта (6 символов): ");
        String number = scanner.nextLine().trim();

        GetStudentDTO dto = new GetStudentDTO(seria, number);
        String result = controller.getStudent(dto);

        System.out.println("\n" + result);

        waitForEnter();
    }

    //УДАЛЕНИЕ СТУДЕНТА
    private static void deleteStudent() {
        System.out.print("Введите серию паспорта (4 символа): ");
        String seria = scanner.nextLine().trim();

        System.out.print("Введите номер паспорта (6 символов): ");
        String number = scanner.nextLine().trim();

        DeleteStudentDTO dto = new DeleteStudentDTO(seria, number);
        boolean deleted = controller.deleteStudent(dto);

        if (deleted) {
            System.out.println("Студент успешно удалён!");
        } else {
            System.out.println("Не удалось удалить. Проверьте введённые данные.");
        }
        waitForEnter();
    }

    //ДОБАВЛЕНИЕ СТУДЕНТА
    private static void addStudent() {
        try {
            System.out.print("Введите имя: ");
            String name = scanner.nextLine().trim();

            System.out.print("Введите фамилию: ");
            String lastName = scanner.nextLine().trim();

            System.out.print("Введите серию паспорта (4 символа): ");
            String seria = scanner.nextLine().trim();

            System.out.print("Введите номер паспорта (6 символов): ");
            String number = scanner.nextLine().trim();

            System.out.print("Введите дату рождения (yyyy-MM-dd): ");
            String dateStr = scanner.nextLine().trim();
            LocalDate birthDate = DateUtils.formatStringToDate(dateStr);

            if (birthDate == null) {
                System.out.println("Неверный формат даты. Операция отменена.");
                return;
            }

            System.out.print("Введите место рождения: ");
            String birthPlace = scanner.nextLine().trim();

            System.out.print("Введите номер телефона: ");
            String phoneNumber = scanner.nextLine().trim();

            System.out.print("Введите email: ");
            String email = scanner.nextLine().trim();

            System.out.print("Введите название факультета: ");
            String facultyName = scanner.nextLine().trim();

            System.out.print("Введите адрес: ");
            String address = scanner.nextLine().trim();

            SaveStudentDTO dto = new SaveStudentDTO(
                    name, lastName, seria, number, birthDate,
                    birthPlace, phoneNumber, email, facultyName, address
            );

            boolean saved = controller.saveStudent(dto);

            if (saved) {
                System.out.println("Студент успешно добавлен в базу!");
            } else {
                System.out.println("Не удалось добавить студента. Проверьте корректность данных.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Произошла ошибка при добавлении студента.");
        }

        waitForEnter();
    }
}
package ru.dataBase.student.view;

import ru.dataBase.student.controller.StudentController;
import ru.dataBase.student.dto.DeleteStudentDTO;
import ru.dataBase.student.dto.GetStudentDTO;
import ru.dataBase.student.dto.SaveStudentDTO;
import ru.dataBase.student.model.Student;

import java.util.Scanner;

public class StudentView {
    private static final StudentController studentController = new StudentController();
    public static void runInterface(){
        System.out.println("-------------------------------------------------------");
        System.out.println("1. Найти студента");
        System.out.println("2. Удалить студента");
        System.out.println("3. Добавить студента");

        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        try {
        choice= scanner.nextInt();
        }catch (NumberFormatException ex){
            System.out.println("Введите коректные данные.");
            runInterface();
        }

        if (choice==1){
            String value = getStudent();
            System.out.println(value);
        }
        else if (choice==2){
            boolean isDeleted = deleteStudent();
            if (isDeleted==true){
                System.out.println("Студент успешно удален");
            }else {
                System.out.println("Во время удаления произошла ошибка. Перепроверьте корректность введенных данных");
            }
        }
        else if (choice==3) {

        }
        else{ System.out.println("Введите коректные данные.");
            runInterface();
        }


    };

    private static String getStudent(){

        System.out.println("Введите серию паспорта студента ");
        Scanner scanner = new Scanner(System.in);
        String seria = scanner.nextLine();

        System.out.println("Введите номер паспорта студента ");
        scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        GetStudentDTO getStudentDTO = new GetStudentDTO(seria, number);
        return studentController.getStudent(getStudentDTO);

    }

    private static boolean deleteStudent(){

        System.out.println("Введите серию паспорта студента ");
        Scanner scanner = new Scanner(System.in);
        String seria = scanner.nextLine();

        System.out.println("Введите номер паспорта студента ");
        scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        DeleteStudentDTO deleteStudentDTO = new DeleteStudentDTO(seria, number);
        return studentController.deleteStudent(deleteStudentDTO);

    }

    private static boolean saveStudent(){

        System.out.println("Введите имя студента ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Введите фамилию студента ");
        scanner = new Scanner(System.in);
        String lastName = scanner.nextLine();

        System.out.println("Введите серию паспорта студента ");
        scanner = new Scanner(System.in);
        String seria = scanner.nextLine();

        System.out.println("Введите номер паспорта студента ");
        scanner = new Scanner(System.in);
        String number = scanner.nextLine();

        System.out.println("Введите дату рождения студента ");
        scanner = new Scanner(System.in);
        String birthDate = scanner.nextLine();

        System.out.println("Введите место рождения студента ");
        scanner = new Scanner(System.in);
        String birthPlace = scanner.nextLine();

        System.out.println("Введите номер телефона студента ");
        scanner = new Scanner(System.in);
        String phoneNumber = scanner.nextLine();

        System.out.println("Введите eMail студента ");
        scanner = new Scanner(System.in);
        String eMail = scanner.nextLine();


        System.out.println("Введите название факультета студента ");
        scanner = new Scanner(System.in);
        String facultyName = scanner.nextLine();

        System.out.println("Введите адрес студента ");
        scanner = new Scanner(System.in);
        String address = scanner.nextLine();

        SaveStudentDTO saveStudentDTO = new SaveStudentDTO(name,lastName,seria,number,birthDate,birthPlace,
                phoneNumber,eMail,facultyName,address);

        return false;
    };
}

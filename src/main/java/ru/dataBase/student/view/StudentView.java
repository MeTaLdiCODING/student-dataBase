package ru.dataBase.student.view;

import ru.dataBase.student.controller.StudentController;
import ru.dataBase.student.dto.DeleteStudentDTO;
import ru.dataBase.student.dto.GetStudentDTO;
import ru.dataBase.student.model.Student;

import java.util.Scanner;

public class StudentView {
    private static StudentController studentController = new StudentController();
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
}

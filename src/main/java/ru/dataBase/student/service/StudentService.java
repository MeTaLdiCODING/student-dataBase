package ru.dataBase.student.service;

import ru.dataBase.student.model.Student;

import java.time.LocalDate;

public interface StudentService {

    Student getStudent(String seria, String Number);

    boolean deleteStudent(String seria, String Number);

    boolean saveStudent(String seria, String number, String name, String lastName, String phoneNumber,
                        String eMail, LocalDate birthDate, String birthPlace,
                        String FacultyName, String address );

}

package ru.dataBase.student.service;

import ru.dataBase.student.model.Student;

import java.time.LocalDate;

public interface StudentService {

    String getStudent(String seria, String number);

    boolean deleteStudent(String seria, String number);

    boolean saveStudent(String seria, String number, String name, String lastName, String phoneNumber,
                        String eMail, LocalDate birthDate, String birthPlace,
                        String FacultyName, String address );


}

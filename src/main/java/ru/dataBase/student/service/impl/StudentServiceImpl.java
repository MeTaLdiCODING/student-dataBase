package ru.dataBase.student.service.impl;

import ru.dataBase.student.model.Faculty;
import ru.dataBase.student.model.Passport;
import ru.dataBase.student.model.Student;
import ru.dataBase.student.service.StudentService;

import java.time.LocalDate;
import java.util.Map;

import static ru.dataBase.student.database.Database.FACULTY;
import static ru.dataBase.student.database.Database.STUDENTS;
import static ru.dataBase.student.util.DateUtils.formatStringToDate;

public class StudentServiceImpl implements StudentService {

    @Override
    public String getStudent(String seria, String number) {
        Passport passport = STUDENTS.keySet()
                .stream()
                .filter(student -> student.getSeria().equals(seria)&&student.getNumber().equals(number))
                .findFirst()
                .orElse(null);
if(passport==null){return "Студента с такими данными в базе нет !";
}

        return STUDENTS.get(passport).toString();
    }

    @Override
    public boolean deleteStudent(String seria, String number) {
      Passport passport = STUDENTS.keySet()
                .stream()
                .filter(student -> student.getSeria().equals(seria)&&student.getNumber().equals(number))
              .findFirst()
              .orElse(null);
        if(passport==null) {
            return false;
        }else {
            STUDENTS.remove(passport);
            return true;
        }


    }

    @Override
    public boolean saveStudent(String seria, String number, String name,
                               String lastName, String phoneNumber, String eMail,
                               LocalDate birthDate, String birthPlace, String FacultyName,
                               String address) {

        Passport passport = new Passport(name, lastName, birthDate, birthPlace, seria, number);

        Faculty faculty = FACULTY
                .stream()
                .filter(facultyVal -> facultyVal.getName().equals(FacultyName) )
                .findFirst()
                .orElse(null);


        Student  student = new Student(name,lastName,phoneNumber,eMail,address,faculty);
        STUDENTS.put(passport,student);
        return true;
    }
}

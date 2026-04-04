package ru.dataBase.student.controller;

import ru.dataBase.student.dto.DeleteStudentDTO;
import ru.dataBase.student.dto.GetStudentDTO;
import ru.dataBase.student.dto.SaveStudentDTO;
import ru.dataBase.student.model.Student;
import ru.dataBase.student.service.StudentService;
import ru.dataBase.student.service.impl.StudentServiceImpl;

public class StudentController {
    StudentService studentService = new StudentServiceImpl();
    public String getStudent(GetStudentDTO studentDTO){
        if (studentDTO.seria().length() !=4){
            return "Введите корректное значени серии паспорта!";
        }
        if (studentDTO.number().length() !=6){
           return "Введите корректное значени номера паспорта!";
        }
        return studentService.getStudent(studentDTO.seria(), studentDTO.number());
    };

    public boolean deleteStudent(DeleteStudentDTO studentDTO){
        if (studentDTO.seria().length() !=4){
            return false;
        }
        if (studentDTO.number().length() !=6){
            return false;
        }
        return studentService.deleteStudent(studentDTO.seria(), studentDTO.number());
    };

    public boolean saveStudent(SaveStudentDTO dto) {
        if (dto.seria() == null || dto.seria().length() != 4) return false;
        if (dto.number() == null || dto.number().length() != 6) return false;
        if (dto.name() == null || dto.name().isBlank() ||
                dto.lastName() == null || dto.lastName().isBlank() ||
                dto.phoneNumber() == null || dto.phoneNumber().isBlank() ||
                dto.eMail() == null || dto.eMail().isBlank() ||
                dto.birthPlace() == null || dto.birthPlace().isBlank() ||
                dto.FacultyName() == null || dto.FacultyName().isBlank() ||
                dto.address() == null || dto.address().isBlank() ||
                dto.birthDate() == null) {
            return false;
        }
        return studentService.saveStudent(
                dto.seria(), dto.number(), dto.name(), dto.lastName(),
                dto.phoneNumber(), dto.eMail(), dto.birthDate(),
                dto.birthPlace(), dto.FacultyName(), dto.address()
        );

}}

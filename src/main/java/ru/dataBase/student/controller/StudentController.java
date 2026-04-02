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
        return studentService.getStudent(studentDTO.getSeria(), studentDTO.getNumber());
    };

    public boolean deleteStudent(DeleteStudentDTO studentDTO){
        return studentService.deleteStudent(studentDTO.getSeria(), studentDTO.getNumber());
    };

    public boolean saveStudent(SaveStudentDTO saveStudentDTO){
        return studentService.saveStudent(saveStudentDTO.getSeria(),saveStudentDTO.getNumber(),
                saveStudentDTO.getName(),saveStudentDTO.getLastName(),
                saveStudentDTO.getPhoneNumber(),saveStudentDTO.getEMail(),
                saveStudentDTO.getBirthDate(),saveStudentDTO.getBirthPlace(),
                saveStudentDTO.getFacultyName(), saveStudentDTO.getAddress());

    };

}

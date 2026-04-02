package ru.dataBase.student.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter

public class SaveStudentDTO {

    private String seria;

    private String number;

    private String name;

    private String lastName;

    private String phoneNumber;

    private String eMail;

    private LocalDate birthDate;

    private String birthPlace;

    private String FacultyName;

    private String address;

}

package ru.dataBase.student.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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

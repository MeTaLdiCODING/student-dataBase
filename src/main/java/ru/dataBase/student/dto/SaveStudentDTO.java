package ru.dataBase.student.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


public record SaveStudentDTO(String name, String lastName, String seria, String number,
                             LocalDate birthDate, String birthPlace, String phoneNumber,
                             String eMail, String FacultyName, String address) {




}

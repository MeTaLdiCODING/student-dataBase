package ru.dataBase.student.model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor


public class Student {

    private String name;

    private String lastName;

    private String phoneNumber;

    private String eMail;

    private String address;

    private Faculty faculty;
}

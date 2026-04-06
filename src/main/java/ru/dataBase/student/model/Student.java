package ru.dataBase.student.model;

import lombok.*;

import javax.swing.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class Student {

    private String name;

    private String lastName;

    private String phoneNumber;

    private String eMail;

    private String address;

    private Faculty faculty;

    @Override
    public String toString() {
        return "Данные о студенте: "+"\n" +
                "--------------------------"+"\n"+
                "Имя: " + name + "\n" +
                "Фамилия: " + lastName + "\n" +
                "Номер телефона: " + phoneNumber + "\n" +
                "eMail: " + eMail + "\n" +
                "Адресс: " + address + "\n" +
                "Факультет: " + faculty +"\n"
                +"---------------------------";
    }
}


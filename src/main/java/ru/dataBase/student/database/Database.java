package ru.dataBase.student.database;

import ru.dataBase.student.model.Faculty;
import ru.dataBase.student.model.Passport;
import ru.dataBase.student.model.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Database {
public final static Map<Passport, Student> STUDENTS= new HashMap<>();

public final static List<Faculty> FACULTY =
        List.of(new Faculty("Информационные технологии", "+79931334442","IT_edu@mail.ru" ),
                new Faculty("Инженерия", "+79932222142","Ing_edu@mail.ru"),
                new Faculty("Дизайн", "+79982231142","Dis_edu@mail.ru"),
                new Faculty("Кинемотограф", "+79982232233","Cin_edu@mail.ru"),
                new Faculty("Архитектура", "+79934661142","Arh_edu@mail.ru"),
                new Faculty("Дизайн", "+79982231142","Dis_edu@mail.ru"),
                new Faculty("Холодильные установки", "+79956778722","Fro_edu@mail.ru"),
                new Faculty("Системное администрирование", "+79992335465","Sys_edu@mail.ru"),
                new Faculty("Педагогика", "+79778901142","Ped_edu@mail.ru")
        );


}

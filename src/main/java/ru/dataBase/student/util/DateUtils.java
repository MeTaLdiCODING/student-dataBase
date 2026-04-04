package ru.dataBase.student.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import static ru.dataBase.student.view.StudentView.runInterface;

public class DateUtils {

    public static LocalDate formatStringToDate(String date){
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            return LocalDate.parse(date,formatter);

        }catch (DateTimeParseException ex){
            System.out.println("Проверьте корректность введенных данных. Обратите внимание на формат ввода!");
        }finally {
            runInterface();
        }
        return null;
    };

}

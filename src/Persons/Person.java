package Persons;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

abstract public class Person
{
    String name;
    String surname;
    String dateInString;
//    DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//    {
//        Date dateRecruitment = null;
//        try {
//            dateRecruitment = sdf.parse(this.dateInString);
//        } catch (ParseException e1) {
//            e1.printStackTrace();
//        }
//        sdf.format(dateRecruitment);
//    }

    Person(String name, String surname, String dateInString)
    {
        this.name = name;
        this.surname = surname;
        this.dateInString = dateInString;
    }

    abstract public void description();

}

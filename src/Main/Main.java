package Main;

import Persons.Person;
import Persons.Employee;
import Persons.Student;
import java.text.ParseException;

public class Main
{
    public static void main(String[] args)
    {
        Person[] person = new Person[5000];
        person[1] = new Employee("Marcin", "Daniec", 12000, "working", "21/01/2012");
        person[2] = new Employee("Sansa", "Stark", 11100,"working", "10/11/2002");
        person[3] = new Student("Tobi", "Drab", "on probation", "08/10/2005");
        person[4] = new Employee("Gregor", "Wood", 200000, "working", "03/07/2007");
        person[5] = new Employee("John", "Snow", 12000, "fired", "04/05/2018");
        person[6] = new Student("Aria", "Stark", "on probation", "17/03/2008");


        for (Person emp : person)
        {
            if (emp instanceof Employee)  //This line checks if person[i] is an instance of Person class
            {
                emp.description();  //down casting from Person to Employee
                ((Employee) emp).work();

            }
        }

        for (Person st : person)
        {
            if (st instanceof Student)
            {
                st.description();
                ((Student) st).studies();
            }
        }

    }
}
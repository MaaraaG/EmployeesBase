package Main;

import Persons.Person;
import Persons.Employee;
import Persons.Student;


public class Main
{
    public static void main(String[] args)
    {
        Person[] person = new Person[5000];
        person[1] = new Employee("Marcin", "Daniec", 12000, "working");
        person[2] = new Employee("Sansa", "Stark", 11100,"working");
        person[3] = new Student("Tobi", "Drab", "on probation");
        person[4] = new Employee("Gregor", "Wood", 200000, "working");
        person[5] = new Employee("John", "Snow", 12000, "fired");
        person[6] = new Student("Aria", "Stark", "on probation");


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
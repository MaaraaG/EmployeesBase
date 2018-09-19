package Persons;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class Employee extends Person
{
    private double salary;
    private String work;

    public Employee(String name, String surname, double salary, String work, String dateInString)
    {
        super(name, surname, dateInString);
        this.salary = salary;
        this.work = work;

    }

    @Override
    public void description()
    {
        System.out.println("---------Employee---------");
        System.out.println("name: " + name);
        System.out.println("Surname: "+ surname);
        System.out.println("Salary: " + salary + " dollars");
    }

    public void work()
    {
        System.out.println("status:  " + work );
        System.out.println("Employed on: " + dateInString  );
        System.out.println("=====================================");

    }


}

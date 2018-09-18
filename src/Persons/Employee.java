package Persons;

public class Employee extends Person
{
    private double salary;
    private String work;

    public Employee(String name, String surname, double salary, String work)
    {
        super(name, surname);
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
        System.out.println("status:  " + work);
        System.out.println("=====================================");

    }
}

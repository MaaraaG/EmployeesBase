package Persons;

abstract public class Person
{
    String name;
    String surname;
    Person (String name, String  surname)
    {
        this.name = name;
        this.surname = surname;
    }

    abstract public  void description();
}

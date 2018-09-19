package Persons;

public class Student extends Person
{
    private String probation;
    public Student (String name, String surname, String probation, String dateInString)
    {
        super(name, surname, dateInString);
        this.probation = probation;
    }

    @Override
    public void description()
    {
        System.out.println("---------Student---------");
        System.out.println("name: " + name );
        System.out.println("Surname: "+ surname);
    }

    public void studies()
    {
        System.out.println("Status: " + probation);
        System.out.println("accepted for internship: " + dateInString  );
        System.out.println("=====================================");
    }

}

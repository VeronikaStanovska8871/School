package sk.kosickaakademia.stanovska.school;

import sk.kosickaakademia.stanovska.school.hobby.Book;
import sk.kosickaakademia.stanovska.school.hobby.Hobby;
import sk.kosickaakademia.stanovska.school.hobby.Movie;

import java.util.Date;

public class Student {
    private String firstName;
    private String lastName;
    private ClassName className;
    private int salary;
    private Date dob;
    private Grades grades;
    private Hobby[] hobbies;
    private int counthobby=0;


    public Student (String firstName, String lastName, Grades grades, ClassName className){
        this.firstName=firstName;
        this.lastName=lastName;
        this.grades=grades;
        this.className=className;
        hobbies= new Hobby[5];
    }

    public Student(String firstName,String lastName, Grades grades, ClassName className, Date dob){
        this (firstName, lastName, grades,className);
        this.dob=dob;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public ClassName getClassName() {
        return className;
    }

    public int getSalary() {
        return salary;
    }

    public Date getDob() {
        return dob;
    }

    public Grades getGrades() {
        return grades;
    }

    @Override
    public String toString(){
        return firstName+" "+lastName;
    }

    public void addHobby (Hobby newHobby){
        int len= hobbies.length;
        if (counthobby==len){
            System.out.println("You can choose just 5 hobbies");
            return;
        }
        hobbies[len]=newHobby;
    }

    public void printHobbies () {
        System.out.println("Students hobby: ");
        int len = hobbies.length;
        for (int i = 0; i < counthobby; i++)
            System.out.println(hobbies[i].getName());
        if (hobbies[i] instanceof Book)
            System.out.println(((Book) hobbies[i]).getAuthor());
        if (hobbies[i] instanceof Movie)
            System.out.println(((Movie) hobbies[i]).getYear());
    }
}

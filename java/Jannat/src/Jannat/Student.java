package Jannat;

public class Student {
    String name;
    int id;
    static String universityName;
    Student()
    {
        System.out.println("Default constructor");
    }
    Student (String name)
    {
        this.name = name;
        System.out.println("Name is : " + name);
    }
    Student (int id)
    {
        this.id = id;
        System.out.println("Id is : " + id);
    }
    void display()
    {
        System.out.println("University name is : "+ universityName);
    }
}


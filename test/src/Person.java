public class Person {
    private String name;
    private int age;
    private String major;
    private double gpa;
    public Person setName(String name){
        this.name = name;
        return this;
    }
    public Person setAge(int age){
        this.age = age;
        return this;
    }
    public Person setMajor(String major){
        this.major = major;
        return this;
    }
    public Person setGpa(double gpa){
        this.gpa = gpa;
        return this;

    }
}


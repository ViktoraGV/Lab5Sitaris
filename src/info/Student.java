package info;

public class Student {
    private String surname;
    private String name;
    private String middleName;
    private int course;
    private String faculty;
    private int group;
    private double averageScore;

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public void print() {
        System.out.println("Surname: " + surname);
        System.out.println("Name: " + name);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Course: " + course);
        System.out.println("Faculty: " + faculty);
        System.out.println("Group: " + group);
        System.out.println("Average Score: " + averageScore);
    }
}

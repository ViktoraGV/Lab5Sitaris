package builderStudent;

import info.Student;

public abstract class StudentBuilder {
    protected Student student;

    public Student getStudent() {
        return student;
    }

    public void newStudent() {
        student = new Student();
    }

    public abstract void buildSurname();
    public abstract void buildName();
    public abstract void buildMiddleName();
    public abstract void buildCourse();
    public abstract void buildFaculty();
    public abstract void buildGroup();
    public abstract void buildAverageScore();
}

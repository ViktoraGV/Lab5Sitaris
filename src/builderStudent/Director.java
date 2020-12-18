package builderStudent;

import info.Student;

public class Director {
    private StudentBuilder studentBuilderXML;

    public Student getStudent() {
        return studentBuilderXML.getStudent();
    }

    public void setStudentBuilderXML(StudentBuilder studentBuilderXML) {
        this.studentBuilderXML = studentBuilderXML;
    }

    public void constructStudent() {
        studentBuilderXML.newStudent();
        studentBuilderXML.buildSurname();
        studentBuilderXML.buildName();
        studentBuilderXML.buildMiddleName();
        studentBuilderXML.buildCourse();
        studentBuilderXML.buildFaculty();
        studentBuilderXML.buildGroup();
        studentBuilderXML.buildAverageScore();
    }
}

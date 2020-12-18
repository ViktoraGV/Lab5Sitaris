package main;

import builderFile.BuildFile;
import builderFile.BuilderFile;
import builderStudent.Director;
import builderStudent.StudentBuilder;
import info.Student;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import builderStudent.StudentBuilderXML;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {
            BuildFile buildFile = BuilderFile.getInstance();
            Document document = buildFile.parse("StudentList.xml");
            Element element = document.getDocumentElement();

            if ("StudentList".equals(element.getTagName())) {
                NodeList students = element.getElementsByTagName("Student");
                Student[] studentsInfo = new Student[students.getLength()];

                for (int i = 0; i < students.getLength(); i++) {

                    Element student = (Element)students.item(i);
                    NodeList info = student.getElementsByTagName("*");

                    Director director = new Director();

                    StudentBuilder studentBuilder = new StudentBuilderXML(info);

                    director.setStudentBuilderXML(studentBuilder);
                    director.constructStudent();

                    studentsInfo[i] = director.getStudent();
                    studentsInfo[i].print();
                    System.out.println("-----------------------------------------------");
                }
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

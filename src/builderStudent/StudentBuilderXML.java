package builderStudent;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class StudentBuilderXML extends StudentBuilder {

    NodeList nodeList;

    public StudentBuilderXML(NodeList nodeList) {
        this.nodeList = nodeList;
    }

    @Override
    public void buildSurname() {
        for (int j = 0; j < nodeList.getLength(); j++) {
            Element element = (Element) nodeList.item(j);
            if (element.getTagName().equals("Surname")) {
                student.setSurname(element.getTextContent());
            }
        }
    }

    @Override
    public void buildName() {
        for (int j = 0; j < nodeList.getLength(); j++) {
            Element element = (Element) nodeList.item(j);
            if (element.getTagName().equals("Name")) {
                student.setName(element.getTextContent());
            }
        }
    }

    @Override
    public void buildMiddleName() {
        for (int j = 0; j < nodeList.getLength(); j++) {
            Element element = (Element) nodeList.item(j);
            if (element.getTagName().equals("MiddleName")) {
                student.setMiddleName(element.getTextContent());
            }
        }
    }

    @Override
    public void buildCourse() {
        for (int j = 0; j < nodeList.getLength(); j++) {
            Element element = (Element) nodeList.item(j);
            if (element.getTagName().equals("Course")) {
                student.setCourse(Integer.parseInt(element.getTextContent()));
            }
        }
    }

    @Override
    public void buildFaculty() {
        for (int j = 0; j < nodeList.getLength(); j++) {
            Element element = (Element) nodeList.item(j);
            if (element.getTagName().equals("Faculty")) {
                student.setFaculty(element.getTextContent());
            }
        }
    }

    @Override
    public void buildGroup() {
        for (int j = 0; j < nodeList.getLength(); j++) {
            Element element = (Element) nodeList.item(j);
            if (element.getTagName().equals("Group")) {
                student.setGroup(Integer.parseInt(element.getTextContent()));
            }
        }
    }

    @Override
    public void buildAverageScore() {
        for (int j = 0; j < nodeList.getLength(); j++) {
            Element element = (Element) nodeList.item(j);
            if (element.getTagName().equals("AverageScore")) {
                student.setAverageScore(Double.parseDouble(element.getTextContent()));
            }
        }
    }
}

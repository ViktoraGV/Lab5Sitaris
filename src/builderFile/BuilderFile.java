package builderFile;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class BuilderFile implements BuildFile{
    private static volatile BuilderFile instance;
    private DocumentBuilder builderFile = null;

    private BuilderFile() throws ParserConfigurationException {
        builderFile = DocumentBuilderFactory.newInstance().newDocumentBuilder();
    }

    public static BuilderFile getInstance() throws  ParserConfigurationException {
        BuilderFile localInstance = instance;
        if (localInstance == null) {
            synchronized (BuilderFile.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new BuilderFile();
                }
            }
        }
        return localInstance;
    }

    @Override
    public Document parse(String name) throws IOException, SAXException {
        return builderFile.parse(name);
    }
}

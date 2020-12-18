package builderFile;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import java.io.IOException;

public interface BuildFile {
    Document parse(String name) throws IOException, SAXException;
}

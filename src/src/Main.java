import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {

        Root root = null;

        File file = new File("20230818_ED807_full.xml");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = dbf.newDocumentBuilder();
        Document document = builder.parse(file);

        Node rootNode = document.getFirstChild();
        NodeList rootChilds = rootNode.getChildNodes();

        Node bicDirectoryEntry = null;
        Node ParticipantInfo = null;
        Node Accounts = null;
        Node SWBICS = null;

        for (int i = 0; i < rootChilds.getLength(); i++) {
            if (rootChilds.item(i).getNodeType() != Node.ELEMENT_NODE)
                continue;
            System.out.println(rootChilds.item(i).getNodeName());
            bicDirectoryEntry = rootChilds.item(i);
        }

        if (bicDirectoryEntry == null) {
            return;
        }

        NodeList directoryChilds = bicDirectoryEntry.getChildNodes();
        for (int i = 0; i < directoryChilds.getLength(); i++) {
            if (directoryChilds.item(i).getNodeType() != Node.ELEMENT_NODE)
                continue;
//            System.out.println(directoryChilds.item(i).getNodeName());
            switch (directoryChilds.item(i).getNodeName()) {
                case "ParticipantInfo": {
                    ParticipantInfo = directoryChilds.item(i);
                    break;
                }
                case "Accounts": {
                    Accounts = directoryChilds.item(i);
                    break;
                }
                case "SWBICS": {
                    SWBICS = directoryChilds.item(i);
                    break;
                }
            }
        }
    }
}
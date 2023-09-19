import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class XMLParser {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse("PacketEPD.xml");
            Element root = doc.getDocumentElement();
            NodeList itemList = root.getElementsByTagName("ED101");

            // Итерируемся по списку элементов
            for (int i = 0; i < itemList.getLength(); i++) {
                Node itemNode = itemList.item(i);
                if (itemNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element itemElement = (Element) itemNode;

                    String name = itemElement.getElementsByTagName("Name").item(0).getTextContent();
//                    String smt = itemElement.getElementsByTagName("BIC").item(0).getTextContent();;
//                    String price = itemElement.getElementsByTagName("Bank").item(0).getTextContent();

                    System.out.println("Name: " + name);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
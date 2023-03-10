package HW3;

import HW3.Items.Worker;
import HW3.Model.Document;
import HW3.Model.JsonFormat;
import HW3.Model.MdFormat;
import HW3.Model.XmlFormate;

public class Controller {
   
    
    public static void run(){
        String pathJson = "HomeWork003/TestText/W1.json";
        String pathMd = "HomeWork003/TestText/W2.md";
        String pathXml = "HomeWork003/TestText/W3.xml";
        Worker w1 = new Worker(32, 35000, "Tom", "Bin" );
        Document doc = new Document<Worker>(w1);
        doc.setFormat(new JsonFormat());
        doc.setPath(pathJson);
        doc.save();
        doc.setFormat(new MdFormat());
        doc.setPath(pathMd);
        doc.save();
        doc.setFormat(new XmlFormate());
        doc.setPath(pathXml);
        doc.save();
    }
}

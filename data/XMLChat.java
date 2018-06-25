package data;

import domain.Message;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;

public class XMLChat {

    //variables
    private Document document;
    private Element root;
    private String path;

    public XMLChat(String path) throws JDOMException, IOException {
        this.path = path;

        File fileStuden = new File(path);

        if (fileStuden.exists()) {//1. el archivo existe, entonces lo cargo en memoria
            //toma las estructuras de datos y las carga
            SAXBuilder saxBuilder = new SAXBuilder();
            saxBuilder.setIgnoringElementContentWhitespace(true);

            //cargar en memoria
            this.document = saxBuilder.build(this.path);
            this.root = this.document.getRootElement();
        } else {//2. el archivo no existe, lo creo y lo guardo
            //creamos el elemento raiz
            this.root = new Element("students");
            //creamos el documento
            this.document = new Document(this.root);
            //guarda el archivo en disco duro
            storeXML();
        }
    }//end method
    
    //almacena xml
    private void storeXML() throws FileNotFoundException, IOException {
        XMLOutputter xmlOutPutter = new XMLOutputter();
        xmlOutPutter.output(this.document, new PrintWriter(this.path));
    }

     //insertar un estudiante nuevo
    public void insertStudent(Message msg) throws IOException {
        
        //debemos crear elemento por elemento respecto al mensaje
        Element eMessage = new Element("message");
        eMessage.setAttribute("identification",msg.getSender());
        
        //sender 
        Element eSender = new Element("sender");
        eSender.addContent(msg.getMessage());
        
        //reciever
        Element eReciever = new Element("reciever");
        eReciever.addContent(msg.getReciever());
        
        //agregar al elemento student el name y el admissiongrade
        eMessage.addContent(eMessage);
        eMessage.addContent(eReciever);
        
        //agregamos al root
        this.root.addContent(eMessage);
        
        //guardamos en disco duro
        storeXML();
    }
    
    
    //leer todos los hijos de la raiz
    public Message[] getAllMessage(){
        int messageQuantity = this.root.getContentSize();
        //obtenesmos una lista con todos los elementos del root
        List elementList = this.root.getChildren();
        
        //definir el tamano del arreglo
        Message[] messageArray = new Message[messageQuantity];
        
        //recorrer la lista para ir insertando en el arreglo
        int cont = 0;
        for(Object curretObject: elementList){
            //casting de object a element
            Element currentElement = (Element)curretObject;
            
            //crear estudiante
            Message currentMessage = new Message();
            
            //id
            currentMessage.setSender(currentElement.getAttributeValue("sender"));
            //name
            currentMessage.setMessage(currentElement.getChild("message").getValue());
            //grade
            currentMessage.setReciever(currentElement.getChild("reciever").getValue());
            messageArray[cont++] = currentMessage;
        }
        return messageArray;
    }
}

package com.adilmx.jaxb_jaxws_app.mappers;

import javax.xml.bind.*;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class XMLMapper<Obj> {
    private Class<Obj> obj;
    private Obj objectInstance;

    public XMLMapper() {
    }

    public XMLMapper(Class<Obj> obj) throws InstantiationException, IllegalAccessException {
        this.obj = obj;
        this.objectInstance = (Obj) obj.newInstance();
    }
    public Obj fromXMLToObject(String path) throws JAXBException, InstantiationException, IllegalAccessException {

        if (!path.equals("")) {
            /* instantiation de JAXB pour le binding */
            JAXBContext jaxbContext = JAXBContext.newInstance(objectInstance.getClass());
            //instantiation de marshaller de jaxb
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            //To format the XML generated with indentations
            System.out.println(new File(path));
            Obj objectFromXML = (Obj) unmarshaller.unmarshal(new File(path));
            return objectFromXML;
        }
        return null;
    }

    public int fromObjectToXML(Obj o, String path) throws JAXBException {
        if (o != null && !path.equals("")) {
            /* instantiation de JAXB pour le binding */
            JAXBContext jaxbContext = JAXBContext.newInstance(o.getClass());
            //instantiation de marshaller de jaxb
            Marshaller marshaller = jaxbContext.createMarshaller();
            //To format the XML generated with indentations
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(o, new File(path));
            return 1;
        }
        return 0;
    }

    public int fromObjectToXMLSchema( String path) throws JAXBException, IOException {
        if (!path.equals("")) {
            /* instantiation de JAXB pour le binding */
            JAXBContext jaxbContext = JAXBContext.newInstance(objectInstance.getClass());
            //Generate the schema XML from an object
            jaxbContext.generateSchema(new SchemaOutputResolver() {
                @Override
                public Result createOutput(String namespaceUri, String suggestedFileName) throws IOException {
                    File fileDestination = new File(path);
                    StreamResult streamResult = new StreamResult(fileDestination);
                    streamResult.setSystemId(fileDestination.getName());
                    return streamResult;
                }
            });
            return 1;
        }
        return 0;
    }

}

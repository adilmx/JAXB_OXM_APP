//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.19 at 04:22:36 AM PDT 
//


package generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GAccount_QNAME = new QName("", "gAccount");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListAccount }
     * 
     */
    public ListAccount createListAccount() {
        return new ListAccount();
    }

    /**
     * Create an instance of {@link GAccount }
     * 
     */
    public GAccount createGAccount() {
        return new GAccount();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "gAccount")
    public JAXBElement<GAccount> createGAccount(GAccount value) {
        return new JAXBElement<GAccount>(_GAccount_QNAME, GAccount.class, null, value);
    }

}

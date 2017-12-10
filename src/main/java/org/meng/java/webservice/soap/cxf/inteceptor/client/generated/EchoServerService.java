
package org.meng.java.webservice.soap.cxf.inteceptor.client.generated;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "EchoServerService", targetNamespace = "http://server.inteceptor.cxf.soap.webservice.java.meng.org/", wsdlLocation = "http://localhost:8080/echo?wsdl")
public class EchoServerService
    extends Service
{

    private final static URL ECHOSERVERSERVICE_WSDL_LOCATION;
    private final static WebServiceException ECHOSERVERSERVICE_EXCEPTION;
    private final static QName ECHOSERVERSERVICE_QNAME = new QName("http://server.inteceptor.cxf.soap.webservice.java.meng.org/", "EchoServerService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/echo?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ECHOSERVERSERVICE_WSDL_LOCATION = url;
        ECHOSERVERSERVICE_EXCEPTION = e;
    }

    public EchoServerService() {
        super(__getWsdlLocation(), ECHOSERVERSERVICE_QNAME);
    }

    public EchoServerService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ECHOSERVERSERVICE_QNAME, features);
    }

    public EchoServerService(URL wsdlLocation) {
        super(wsdlLocation, ECHOSERVERSERVICE_QNAME);
    }

    public EchoServerService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ECHOSERVERSERVICE_QNAME, features);
    }

    public EchoServerService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EchoServerService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EchoServer
     */
    @WebEndpoint(name = "EchoServerPort")
    public EchoServer getEchoServerPort() {
        return super.getPort(new QName("http://server.inteceptor.cxf.soap.webservice.java.meng.org/", "EchoServerPort"), EchoServer.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EchoServer
     */
    @WebEndpoint(name = "EchoServerPort")
    public EchoServer getEchoServerPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://server.inteceptor.cxf.soap.webservice.java.meng.org/", "EchoServerPort"), EchoServer.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ECHOSERVERSERVICE_EXCEPTION!= null) {
            throw ECHOSERVERSERVICE_EXCEPTION;
        }
        return ECHOSERVERSERVICE_WSDL_LOCATION;
    }

}

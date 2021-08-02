
package com.var.soap.ws.client;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.var.soap.ws.client package. 
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

    private final static QName _RetrieveVatRatesReqMsg_QNAME = new QName("urn:ec.europa.eu:taxud:tedb:services:v1:IVatRetrievalService", "retrieveVatRatesReqMsg");
    private final static QName _RetrieveVatRatesRespMsg_QNAME = new QName("urn:ec.europa.eu:taxud:tedb:services:v1:IVatRetrievalService", "retrieveVatRatesRespMsg");
    private final static QName _RetrieveVatRatesFaultMsg_QNAME = new QName("urn:ec.europa.eu:taxud:tedb:services:v1:IVatRetrievalService", "retrieveVatRatesFaultMsg");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.var.soap.ws.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RetrieveVatRatesRespType }
     * 
     */
    public RetrieveVatRatesRespType createRetrieveVatRatesRespType() {
        return new RetrieveVatRatesRespType();
    }

    /**
     * Create an instance of {@link RetrieveVatRatesReqType }
     * 
     */
    public RetrieveVatRatesReqType createRetrieveVatRatesReqType() {
        return new RetrieveVatRatesReqType();
    }

    /**
     * Create an instance of {@link RetrieveVatRatesFaultType }
     * 
     */
    public RetrieveVatRatesFaultType createRetrieveVatRatesFaultType() {
        return new RetrieveVatRatesFaultType();
    }

    /**
     * Create an instance of {@link RequestMemberStateType }
     * 
     */
    public RequestMemberStateType createRequestMemberStateType() {
        return new RequestMemberStateType();
    }

    /**
     * Create an instance of {@link RateValueType }
     * 
     */
    public RateValueType createRateValueType() {
        return new RateValueType();
    }

    /**
     * Create an instance of {@link ResponseCodeType }
     * 
     */
    public ResponseCodeType createResponseCodeType() {
        return new ResponseCodeType();
    }

    /**
     * Create an instance of {@link ResponseCodeDetailsType }
     * 
     */
    public ResponseCodeDetailsType createResponseCodeDetailsType() {
        return new ResponseCodeDetailsType();
    }

    /**
     * Create an instance of {@link RequestCodeType }
     * 
     */
    public RequestCodeType createRequestCodeType() {
        return new RequestCodeType();
    }

    /**
     * Create an instance of {@link RequestCategoryType }
     * 
     */
    public RequestCategoryType createRequestCategoryType() {
        return new RequestCategoryType();
    }

    /**
     * Create an instance of {@link CategoryType }
     * 
     */
    public CategoryType createCategoryType() {
        return new CategoryType();
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link RetrieveVatRatesRespType.VatRateResults }
     * 
     */
    public RetrieveVatRatesRespType.VatRateResults createRetrieveVatRatesRespTypeVatRateResults() {
        return new RetrieveVatRatesRespType.VatRateResults();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveVatRatesReqType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetrieveVatRatesReqType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ec.europa.eu:taxud:tedb:services:v1:IVatRetrievalService", name = "retrieveVatRatesReqMsg")
    public JAXBElement<RetrieveVatRatesReqType> createRetrieveVatRatesReqMsg(RetrieveVatRatesReqType value) {
        return new JAXBElement<RetrieveVatRatesReqType>(_RetrieveVatRatesReqMsg_QNAME, RetrieveVatRatesReqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveVatRatesRespType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetrieveVatRatesRespType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ec.europa.eu:taxud:tedb:services:v1:IVatRetrievalService", name = "retrieveVatRatesRespMsg")
    public JAXBElement<RetrieveVatRatesRespType> createRetrieveVatRatesRespMsg(RetrieveVatRatesRespType value) {
        return new JAXBElement<RetrieveVatRatesRespType>(_RetrieveVatRatesRespMsg_QNAME, RetrieveVatRatesRespType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveVatRatesFaultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetrieveVatRatesFaultType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:ec.europa.eu:taxud:tedb:services:v1:IVatRetrievalService", name = "retrieveVatRatesFaultMsg")
    public JAXBElement<RetrieveVatRatesFaultType> createRetrieveVatRatesFaultMsg(RetrieveVatRatesFaultType value) {
        return new JAXBElement<RetrieveVatRatesFaultType>(_RetrieveVatRatesFaultMsg_QNAME, RetrieveVatRatesFaultType.class, null, value);
    }

}

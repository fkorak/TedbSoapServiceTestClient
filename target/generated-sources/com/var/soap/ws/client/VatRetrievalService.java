
package com.var.soap.ws.client;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebService(name = "vatRetrievalService", targetNamespace = "urn:ec.europa.eu:taxud:tedb:services:v1:VatRetrievalService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface VatRetrievalService {


    /**
     * 
     * @param retrieveVatRatesReqMsg
     * @return
     *     returns com.var.soap.ws.client.RetrieveVatRatesRespType
     * @throws RetrieveVatRatesFaultMsg
     */
    @WebMethod(action = "urn:ec.europa.eu:taxud:tedb:services:v1:VatRetrievalService/RetrieveVatRates")
    @WebResult(name = "retrieveVatRatesRespMsg", targetNamespace = "urn:ec.europa.eu:taxud:tedb:services:v1:IVatRetrievalService", partName = "retrieveVatRatesRespMsg")
    public RetrieveVatRatesRespType retrieveVatRates(
        @WebParam(name = "retrieveVatRatesReqMsg", targetNamespace = "urn:ec.europa.eu:taxud:tedb:services:v1:IVatRetrievalService", partName = "retrieveVatRatesReqMsg")
        RetrieveVatRatesReqType retrieveVatRatesReqMsg)
        throws RetrieveVatRatesFaultMsg
    ;

}

package com.var;

import com.var.soap.ws.client.*;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.GregorianCalendar;

public class HelloService {
    public static void main(String[] args) throws DatatypeConfigurationException, RetrieveVatRatesFaultMsg {

        System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
        System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dumpTreshold", "999999");

        VatRetrievalServiceService service = new VatRetrievalServiceService();
        var retrieval = service.getVatRetrievalService();

        RetrieveVatRatesReqType req = new RetrieveVatRatesReqType();


        RequestMemberStateType memberStateType = new RequestMemberStateType();
        memberStateType.getIsoCode().add("DE");
        req.setMemberStates(memberStateType);

        ZoneId z = ZoneId.of( "Africa/Casablanca" ) ;
        ZonedDateTime zdt = ZonedDateTime.now( z );
        GregorianCalendar gregCal = GregorianCalendar.from( zdt ) ;
        XMLGregorianCalendar xmlGregCal = DatatypeFactory.newInstance().newXMLGregorianCalendar( gregCal );

        req.setSituationOn(xmlGregCal);
        var resp = retrieval.retrieveVatRates(req);

        for (RetrieveVatRatesRespType.VatRateResults result: resp.getVatRateResults())
        {
            System.out.println(result.getRate().getValue());
        }

    }
}


package com.var.soap.ws.client;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for retrieveVatRatesReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="retrieveVatRatesReqType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="memberStates" type="{urn:ec.europa.eu:taxud:tedb:services:v1:IVatRetrievalService:types}requestMemberStateType"/&gt;
 *         &lt;element name="situationOn" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="categories" type="{urn:ec.europa.eu:taxud:tedb:services:v1:IVatRetrievalService:types}requestCategoryType" minOccurs="0"/&gt;
 *         &lt;element name="cnCodes" type="{urn:ec.europa.eu:taxud:tedb:services:v1:IVatRetrievalService:types}requestCodeType" minOccurs="0"/&gt;
 *         &lt;element name="cpaCodes" type="{urn:ec.europa.eu:taxud:tedb:services:v1:IVatRetrievalService:types}requestCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retrieveVatRatesReqType", propOrder = {
    "memberStates",
    "situationOn",
    "categories",
    "cnCodes",
    "cpaCodes"
})
public class RetrieveVatRatesReqType {

    @XmlElement(required = true)
    protected RequestMemberStateType memberStates;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar situationOn;
    protected RequestCategoryType categories;
    protected RequestCodeType cnCodes;
    protected RequestCodeType cpaCodes;

    /**
     * Gets the value of the memberStates property.
     * 
     * @return
     *     possible object is
     *     {@link RequestMemberStateType }
     *     
     */
    public RequestMemberStateType getMemberStates() {
        return memberStates;
    }

    /**
     * Sets the value of the memberStates property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestMemberStateType }
     *     
     */
    public void setMemberStates(RequestMemberStateType value) {
        this.memberStates = value;
    }

    /**
     * Gets the value of the situationOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSituationOn() {
        return situationOn;
    }

    /**
     * Sets the value of the situationOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSituationOn(XMLGregorianCalendar value) {
        this.situationOn = value;
    }

    /**
     * Gets the value of the categories property.
     * 
     * @return
     *     possible object is
     *     {@link RequestCategoryType }
     *     
     */
    public RequestCategoryType getCategories() {
        return categories;
    }

    /**
     * Sets the value of the categories property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestCategoryType }
     *     
     */
    public void setCategories(RequestCategoryType value) {
        this.categories = value;
    }

    /**
     * Gets the value of the cnCodes property.
     * 
     * @return
     *     possible object is
     *     {@link RequestCodeType }
     *     
     */
    public RequestCodeType getCnCodes() {
        return cnCodes;
    }

    /**
     * Sets the value of the cnCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestCodeType }
     *     
     */
    public void setCnCodes(RequestCodeType value) {
        this.cnCodes = value;
    }

    /**
     * Gets the value of the cpaCodes property.
     * 
     * @return
     *     possible object is
     *     {@link RequestCodeType }
     *     
     */
    public RequestCodeType getCpaCodes() {
        return cpaCodes;
    }

    /**
     * Sets the value of the cpaCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestCodeType }
     *     
     */
    public void setCpaCodes(RequestCodeType value) {
        this.cpaCodes = value;
    }

}

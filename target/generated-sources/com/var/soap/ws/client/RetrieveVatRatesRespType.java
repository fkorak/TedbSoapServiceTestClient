
package com.var.soap.ws.client;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for retrieveVatRatesRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="retrieveVatRatesRespType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vatRateResults" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="memberState" type="{urn:ec.europa.eu:taxud:tedb:services:v1:IVatRetrievalService:types}countryIsoCodeType"/&gt;
 *                   &lt;element name="type" type="{urn:ec.europa.eu:taxud:tedb:services:v1:IVatRetrievalService:types}rateTypeEnum"/&gt;
 *                   &lt;element name="rate" type="{urn:ec.europa.eu:taxud:tedb:services:v1:IVatRetrievalService:types}rateValueType"/&gt;
 *                   &lt;element name="cnCodes" type="{urn:ec.europa.eu:taxud:tedb:services:v1:IVatRetrievalService:types}responseCodeType" minOccurs="0"/&gt;
 *                   &lt;element name="cpaCodes" type="{urn:ec.europa.eu:taxud:tedb:services:v1:IVatRetrievalService:types}responseCodeType" minOccurs="0"/&gt;
 *                   &lt;element name="category" type="{urn:ec.europa.eu:taxud:tedb:services:v1:IVatRetrievalService:types}categoryType" minOccurs="0"/&gt;
 *                   &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retrieveVatRatesRespType", propOrder = {
    "vatRateResults"
})
public class RetrieveVatRatesRespType {

    protected List<RetrieveVatRatesRespType.VatRateResults> vatRateResults;

    /**
     * Gets the value of the vatRateResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the vatRateResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVatRateResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetrieveVatRatesRespType.VatRateResults }
     * 
     * 
     */
    public List<RetrieveVatRatesRespType.VatRateResults> getVatRateResults() {
        if (vatRateResults == null) {
            vatRateResults = new ArrayList<RetrieveVatRatesRespType.VatRateResults>();
        }
        return this.vatRateResults;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="memberState" type="{urn:ec.europa.eu:taxud:tedb:services:v1:IVatRetrievalService:types}countryIsoCodeType"/&gt;
     *         &lt;element name="type" type="{urn:ec.europa.eu:taxud:tedb:services:v1:IVatRetrievalService:types}rateTypeEnum"/&gt;
     *         &lt;element name="rate" type="{urn:ec.europa.eu:taxud:tedb:services:v1:IVatRetrievalService:types}rateValueType"/&gt;
     *         &lt;element name="cnCodes" type="{urn:ec.europa.eu:taxud:tedb:services:v1:IVatRetrievalService:types}responseCodeType" minOccurs="0"/&gt;
     *         &lt;element name="cpaCodes" type="{urn:ec.europa.eu:taxud:tedb:services:v1:IVatRetrievalService:types}responseCodeType" minOccurs="0"/&gt;
     *         &lt;element name="category" type="{urn:ec.europa.eu:taxud:tedb:services:v1:IVatRetrievalService:types}categoryType" minOccurs="0"/&gt;
     *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "memberState",
        "type",
        "rate",
        "cnCodes",
        "cpaCodes",
        "category",
        "comment"
    })
    public static class VatRateResults {

        @XmlElement(required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String memberState;
        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected RateTypeEnum type;
        @XmlElement(required = true)
        protected RateValueType rate;
        protected ResponseCodeType cnCodes;
        protected ResponseCodeType cpaCodes;
        protected CategoryType category;
        protected String comment;

        /**
         * Gets the value of the memberState property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMemberState() {
            return memberState;
        }

        /**
         * Sets the value of the memberState property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMemberState(String value) {
            this.memberState = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link RateTypeEnum }
         *     
         */
        public RateTypeEnum getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link RateTypeEnum }
         *     
         */
        public void setType(RateTypeEnum value) {
            this.type = value;
        }

        /**
         * Gets the value of the rate property.
         * 
         * @return
         *     possible object is
         *     {@link RateValueType }
         *     
         */
        public RateValueType getRate() {
            return rate;
        }

        /**
         * Sets the value of the rate property.
         * 
         * @param value
         *     allowed object is
         *     {@link RateValueType }
         *     
         */
        public void setRate(RateValueType value) {
            this.rate = value;
        }

        /**
         * Gets the value of the cnCodes property.
         * 
         * @return
         *     possible object is
         *     {@link ResponseCodeType }
         *     
         */
        public ResponseCodeType getCnCodes() {
            return cnCodes;
        }

        /**
         * Sets the value of the cnCodes property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResponseCodeType }
         *     
         */
        public void setCnCodes(ResponseCodeType value) {
            this.cnCodes = value;
        }

        /**
         * Gets the value of the cpaCodes property.
         * 
         * @return
         *     possible object is
         *     {@link ResponseCodeType }
         *     
         */
        public ResponseCodeType getCpaCodes() {
            return cpaCodes;
        }

        /**
         * Sets the value of the cpaCodes property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResponseCodeType }
         *     
         */
        public void setCpaCodes(ResponseCodeType value) {
            this.cpaCodes = value;
        }

        /**
         * Gets the value of the category property.
         * 
         * @return
         *     possible object is
         *     {@link CategoryType }
         *     
         */
        public CategoryType getCategory() {
            return category;
        }

        /**
         * Sets the value of the category property.
         * 
         * @param value
         *     allowed object is
         *     {@link CategoryType }
         *     
         */
        public void setCategory(CategoryType value) {
            this.category = value;
        }

        /**
         * Gets the value of the comment property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComment() {
            return comment;
        }

        /**
         * Sets the value of the comment property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setComment(String value) {
            this.comment = value;
        }

    }

}

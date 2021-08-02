
package com.var.soap.ws.client;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rateValueTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="rateValueTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DEFAULT"/&gt;
 *     &lt;enumeration value="NOT_APPLICABLE"/&gt;
 *     &lt;enumeration value="OUT_OF_SCOPE"/&gt;
 *     &lt;enumeration value="EXEMPTED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "rateValueTypeEnum")
@XmlEnum
public enum RateValueTypeEnum {

    DEFAULT,
    NOT_APPLICABLE,
    OUT_OF_SCOPE,
    EXEMPTED;

    public String value() {
        return name();
    }

    public static RateValueTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}

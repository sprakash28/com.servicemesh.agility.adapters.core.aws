//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.01 at 08:18:37 AM CDT 
//


package com.amazonaws.rds.doc._2010_07_28;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                   <p>
 *           
 *                   </p>
 *               
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DBParameterGroupName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Parameters" type="{http://rds.amazonaws.com/doc/2010-07-28/}ParametersList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dbParameterGroupName",
    "parameters"
})
@XmlRootElement(name = "ModifyDBParameterGroup")
public class ModifyDBParameterGroup {

    @XmlElement(name = "DBParameterGroupName", required = true)
    protected String dbParameterGroupName;
    @XmlElement(name = "Parameters", required = true)
    protected ParametersList parameters;

    /**
     * Gets the value of the dbParameterGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBParameterGroupName() {
        return dbParameterGroupName;
    }

    /**
     * Sets the value of the dbParameterGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDBParameterGroupName(String value) {
        this.dbParameterGroupName = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link ParametersList }
     *     
     */
    public ParametersList getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametersList }
     *     
     */
    public void setParameters(ParametersList value) {
        this.parameters = value;
    }

}
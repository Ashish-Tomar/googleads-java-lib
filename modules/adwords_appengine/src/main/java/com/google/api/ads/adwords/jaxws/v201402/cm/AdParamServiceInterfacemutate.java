
package com.google.api.ads.adwords.jaxws.v201402.cm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Sets and removes ad parameters.
 *             <p class="note"><b>Note:</b> {@code ADD} is not supported. Use {@code SET}
 *             for new ad parameters.</p>
 *             
 *             <ul class="nolist">
 *             <li>{@code SET}: Creates or updates an ad parameter, setting the new
 *             parameterized value for the given ad group / keyword pair.
 *             <li>{@code REMOVE}: Removes an ad parameter. The <code><var>default-value</var>
 *             </code> specified in the ad text will be used.</li>
 *             </ul>
 *             
 *             @param operations The operations to perform.
 *             @return A list of ad parameters, where each entry in the list is the
 *             result of applying the operation in the input list with the same index.
 *             For a {@code SET} operation, the returned ad parameter will contain the
 *             updated values. For a {@code REMOVE} operation, the returned ad parameter
 *             will simply be the ad parameter that was removed.
 *           
 * 
 * <p>Java class for mutate element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="mutate">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="operations" type="{https://adwords.google.com/api/adwords/cm/v201402}AdParamOperation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "operations"
})
@XmlRootElement(name = "mutate")
public class AdParamServiceInterfacemutate {

    protected List<AdParamOperation> operations;

    /**
     * Gets the value of the operations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdParamOperation }
     * 
     * 
     */
    public List<AdParamOperation> getOperations() {
        if (operations == null) {
            operations = new ArrayList<AdParamOperation>();
        }
        return this.operations;
    }

}

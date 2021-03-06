
package com.google.api.ads.dfp.jaxws.v201403;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the delete action that can be performed on
 *             {@link CustomTargetingKey} objects. Deleting a key will not delete the
 *             {@link CustomTargetingValue} objects associated with it. Also, if a custom
 *             targeting key that has been deleted is recreated, any previous custom
 *             targeting values associated with it that were not deleted will continue to
 *             exist.
 *           
 * 
 * <p>Java class for DeleteCustomTargetingKeys complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteCustomTargetingKeys">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201403}CustomTargetingKeyAction">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteCustomTargetingKeys")
public class DeleteCustomTargetingKeys
    extends CustomTargetingKeyAction
{


}


package com.google.api.ads.adwords.jaxws.v201402.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeprecatedAd.Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeprecatedAd.Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VIDEO"/>
 *     &lt;enumeration value="CLICK_TO_CALL"/>
 *     &lt;enumeration value="IN_STREAM_VIDEO"/>
 *     &lt;enumeration value="FROOGLE"/>
 *     &lt;enumeration value="TEXT_LINK"/>
 *     &lt;enumeration value="GADGET"/>
 *     &lt;enumeration value="PRINT"/>
 *     &lt;enumeration value="TEXT_WIDE"/>
 *     &lt;enumeration value="GADGET_TEMPLATE"/>
 *     &lt;enumeration value="TEXT_WITH_VIDEO"/>
 *     &lt;enumeration value="AUDIO"/>
 *     &lt;enumeration value="LOCAL_BUSINESS_AD"/>
 *     &lt;enumeration value="AUDIO_TEMPLATE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeprecatedAd.Type")
@XmlEnum
public enum DeprecatedAdType {


    /**
     * 
     *                 Video ad.
     *               
     * 
     */
    VIDEO,

    /**
     * 
     *                 Click to call ad.
     *               
     * 
     */
    CLICK_TO_CALL,

    /**
     * 
     *                 Instream video ad.
     *               
     * 
     */
    IN_STREAM_VIDEO,

    /**
     * 
     *                 Froogle ad.
     *               
     * 
     */
    FROOGLE,

    /**
     * 
     *                 Text link ad.
     *               
     * 
     */
    TEXT_LINK,

    /**
     * 
     *                 Gadget ad.
     *               
     * 
     */
    GADGET,

    /**
     * 
     *                 Print ad.
     *               
     * 
     */
    PRINT,

    /**
     * 
     *                 Wide text ad.
     *               
     * 
     */
    TEXT_WIDE,

    /**
     * 
     *                 Gadget template ad.
     *               
     * 
     */
    GADGET_TEMPLATE,

    /**
     * 
     *                 Text ad with video.
     *               
     * 
     */
    TEXT_WITH_VIDEO,

    /**
     * 
     *                 Audio ad.
     *               
     * 
     */
    AUDIO,

    /**
     * 
     *                 Local business ads.
     *               
     * 
     */
    LOCAL_BUSINESS_AD,

    /**
     * 
     *                 Audio based template ads.
     *               
     * 
     */
    AUDIO_TEMPLATE,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static DeprecatedAdType fromValue(String v) {
        return valueOf(v);
    }

}

/**
 * RichMediaMobileInAppAsset.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class RichMediaMobileInAppAsset  extends com.google.api.ads.dfa.axis.v1_19.RichMediaHtmlAsset  implements java.io.Serializable {
    private com.google.api.ads.dfa.axis.v1_19.RichMediaImageAsset alternateImageAsset;

    private boolean transparent;

    public RichMediaMobileInAppAsset() {
    }

    public RichMediaMobileInAppAsset(
           java.lang.String fileName,
           int fileSize,
           long id,
           long parentAssetId,
           java.lang.String type,
           java.lang.String creativeFormat,
           int height,
           int width,
           com.google.api.ads.dfa.axis.v1_19.RichMediaImageAsset alternateImageAsset,
           boolean transparent) {
        super(
            fileName,
            fileSize,
            id,
            parentAssetId,
            type,
            creativeFormat,
            height,
            width);
        this.alternateImageAsset = alternateImageAsset;
        this.transparent = transparent;
    }


    /**
     * Gets the alternateImageAsset value for this RichMediaMobileInAppAsset.
     * 
     * @return alternateImageAsset
     */
    public com.google.api.ads.dfa.axis.v1_19.RichMediaImageAsset getAlternateImageAsset() {
        return alternateImageAsset;
    }


    /**
     * Sets the alternateImageAsset value for this RichMediaMobileInAppAsset.
     * 
     * @param alternateImageAsset
     */
    public void setAlternateImageAsset(com.google.api.ads.dfa.axis.v1_19.RichMediaImageAsset alternateImageAsset) {
        this.alternateImageAsset = alternateImageAsset;
    }


    /**
     * Gets the transparent value for this RichMediaMobileInAppAsset.
     * 
     * @return transparent
     */
    public boolean isTransparent() {
        return transparent;
    }


    /**
     * Sets the transparent value for this RichMediaMobileInAppAsset.
     * 
     * @param transparent
     */
    public void setTransparent(boolean transparent) {
        this.transparent = transparent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RichMediaMobileInAppAsset)) return false;
        RichMediaMobileInAppAsset other = (RichMediaMobileInAppAsset) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.alternateImageAsset==null && other.getAlternateImageAsset()==null) || 
             (this.alternateImageAsset!=null &&
              this.alternateImageAsset.equals(other.getAlternateImageAsset()))) &&
            this.transparent == other.isTransparent();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAlternateImageAsset() != null) {
            _hashCode += getAlternateImageAsset().hashCode();
        }
        _hashCode += (isTransparent() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RichMediaMobileInAppAsset.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "RichMediaMobileInAppAsset"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateImageAsset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alternateImageAsset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "RichMediaImageAsset"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transparent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transparent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}


package com.google.api.ads.adwords.jaxws.v201309.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FunctionError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FunctionError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DATA_TYPE_MISMATCH"/>
 *     &lt;enumeration value="INVALID_CONJUNCTION_OPERANDS"/>
 *     &lt;enumeration value="INVALID_NUMBER_OF_OPERANDS"/>
 *     &lt;enumeration value="INVALID_OPERAND_TYPE"/>
 *     &lt;enumeration value="INVALID_OPERATOR"/>
 *     &lt;enumeration value="INVALID_REQUEST_CONTEXT_TYPE"/>
 *     &lt;enumeration value="INVALID_FUNCTION_FOR_CALL_PLACEHOLDER"/>
 *     &lt;enumeration value="INVALID_OPERAND"/>
 *     &lt;enumeration value="MISSING_CONSTANT_OPERAND_VALUE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FunctionError.Reason")
@XmlEnum
public enum FunctionErrorReason {


    /**
     * 
     *                 Operand data types do not match.
     *               
     * 
     */
    DATA_TYPE_MISMATCH,

    /**
     * 
     *                 The operands cannot be used together in a conjunction.
     *               
     * 
     */
    INVALID_CONJUNCTION_OPERANDS,

    /**
     * 
     *                 Invalid numer of Operands.
     *               
     * 
     */
    INVALID_NUMBER_OF_OPERANDS,

    /**
     * 
     *                 Operand Type not supported.
     *               
     * 
     */
    INVALID_OPERAND_TYPE,

    /**
     * 
     *                 Operator not supported.
     *               
     * 
     */
    INVALID_OPERATOR,

    /**
     * 
     *                 Request context type not supported.
     *               
     * 
     */
    INVALID_REQUEST_CONTEXT_TYPE,

    /**
     * 
     *                 The matching function is not allowed for call placeholders
     *               
     * 
     */
    INVALID_FUNCTION_FOR_CALL_PLACEHOLDER,

    /**
     * 
     *                 Invalid operand.
     *               
     * 
     */
    INVALID_OPERAND,

    /**
     * 
     *                 Missing value for the constant operand.
     *               
     * 
     */
    MISSING_CONSTANT_OPERAND_VALUE,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static FunctionErrorReason fromValue(String v) {
        return valueOf(v);
    }

}

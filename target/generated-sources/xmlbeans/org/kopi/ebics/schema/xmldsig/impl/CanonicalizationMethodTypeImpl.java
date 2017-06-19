/*
 * XML Type:  CanonicalizationMethodType
 * Namespace: http://www.w3.org/2000/09/xmldsig#
 * Java type: org.kopi.ebics.schema.xmldsig.CanonicalizationMethodType
 *
 * Automatically generated - do not modify.
 */
package org.kopi.ebics.schema.xmldsig.impl;
/**
 * An XML CanonicalizationMethodType(@http://www.w3.org/2000/09/xmldsig#).
 *
 * This is a complex type.
 */
public class CanonicalizationMethodTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.kopi.ebics.schema.xmldsig.CanonicalizationMethodType
{
    private static final long serialVersionUID = 1L;
    
    public CanonicalizationMethodTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALGORITHM$0 = 
        new javax.xml.namespace.QName("", "Algorithm");
    
    
    /**
     * Gets the "Algorithm" attribute
     */
    public java.lang.String getAlgorithm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALGORITHM$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Algorithm" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetAlgorithm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(ALGORITHM$0);
            return target;
        }
    }
    
    /**
     * Sets the "Algorithm" attribute
     */
    public void setAlgorithm(java.lang.String algorithm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALGORITHM$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALGORITHM$0);
            }
            target.setStringValue(algorithm);
        }
    }
    
    /**
     * Sets (as xml) the "Algorithm" attribute
     */
    public void xsetAlgorithm(org.apache.xmlbeans.XmlAnyURI algorithm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(ALGORITHM$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(ALGORITHM$0);
            }
            target.set(algorithm);
        }
    }
}
